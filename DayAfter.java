import javax.swing.JOptionPane;
class DayAfter{
    static String[] Months={"January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December"};
    static int[] Days= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static boolean isLeap(int n){
        if(n%100!=0&&n%4==0)
        return true;
        else if(n%100==0&&n%400==0)
        return true;
        else
        return false;
    }
    public static void main(String args[]){
        String date=JOptionPane.showInputDialog("Enter the date in DD/MM/YYYY format: ");
        int od=Integer.parseInt(date.substring(0,2));
        int om=Integer.parseInt(date.substring(3,5));
        int oy=Integer.parseInt(date.substring(6));
        int ff=Integer.parseInt(JOptionPane.showInputDialog("Enter days to skip ahead: "));
        
        //First, we find the number of days into the year so we can start all over
        int nff=ff;
        int[] tempDays=Days;
        if(isLeap(oy))
        tempDays[1]=29;
        for(int i=0; i<om-1; i++){
            nff+=tempDays[i];
        }
        nff+=od; //Now we have new days to skip from the date;
        int ny=oy;
        while(nff>0){
            if(isLeap(ny))
            nff-=366;
            else
            nff-=365;
            ++ny;
        }
        --ny;
        //now restore the days needed

        if(isLeap(ny))
        nff+=366;
        else
        nff+=365;
        
        //now, we calculate the new date, i.e., date and month
        int monInd=0;
        tempDays=Days;
        if(isLeap(ny))
        tempDays[1]=29;
        while(nff>0){
            nff-=tempDays[monInd];
            ++monInd;
        }
        --monInd;
        nff+=tempDays[monInd];
        JOptionPane.showMessageDialog(null, "The new Date after "+ff+" days is: "+nff+"/"+(monInd+1)+"/"+ny);
    }
}