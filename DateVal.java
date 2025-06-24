import java.util.Scanner;
class DateVal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date in 'dd/mm/yyyy' format");
        String date=sc.nextLine();
        StringDate(date);
    }
    public static void StringDate(String date){
        int flag=1;
        int dd=Integer.parseInt(date.substring(0,2));
        int mm=Integer.parseInt(date.substring(3,5));
        int yyyy=Integer.parseInt(date.substring(6));
        int SLen= date.length();
        if(SLen!=10){
            System.out.println("The date input is invalid or wrongly formatted");
            System.exit(0);
        }
        else{
            if(dd>31||dd<1){
                
                System.out.println("The year entered is invalid (Step 0)");
                System.exit(0);
            }
            if(mm>12||mm<1){
                
                System.out.println("The year entered is invalid (Step 1)");
                System.exit(0);
            }
            if(yyyy<1900||yyyy>2050){
                
                System.out.println("The year entered is invalid (Step 2)");
                System.exit(0);
            }
            if(dd>30&&(mm!=1&&mm!=3&&mm!=5&&mm!=7&&mm!=8&&mm!=10&&mm!=12)){
                
                System.out.println("The year entered is invalid (Step 3)");
                System.exit(0);
            }
        int LeapFlag=0;
        if((yyyy%100==0&&yyyy%400==0)||(yyyy%100!=0&&yyyy%4==0)){
            LeapFlag=1;
        }
        if(mm==2&&dd==29&&LeapFlag!=1){
            
            System.out.println("The year entered is invalid (Step 4)");
            System.exit(0);
        }
        if(mm==2&&dd>29){
            System.out.println("The year entered is invalid (Step 5)");
            System.exit(0);
        }
        System.out.println("The date is valid");
        }
    }
}