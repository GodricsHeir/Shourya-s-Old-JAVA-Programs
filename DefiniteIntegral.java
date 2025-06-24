import javax.swing.JOptionPane;
class DefiniteIntegral{ //VERSION 1.2 ==> ONLY FOR POLYNOMIAL INTEGRALS + NEGATIVE POWERS + CONSTANT DELETION
    static double retVal(String s, int n){
        double val=0;
        int len=s.length();
        int index=0;
        for(int i=0; i<len; i++){
            if(Character.isLetter(s.charAt(i))){
                index=i;
                break;
            }
            if(Character.isLetter(s.charAt(i))==false&&i==len-1){
                return 0;
            }
        }
        double cf=Double.parseDouble(s.substring(0, index));
        double pow=Double.parseDouble(s.substring(index+1));
        double absPow=pow;
        if(pow<0)
        absPow=(-1)*pow;
        double pt=(Math.pow(n,absPow));
        if(pow<0&&n!=0)
        pt=(1/pt);
        val=pt*cf;
        return val;
    }
    public static void main(String arg[]){
        int term=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of terms: "));
        String[] integral=new String[term];
        double[] intValLow=new double[term];
        double[] intValHigh=new double[term];
        for(int i=0; i<term; i++){
            integral[i]=JOptionPane.showInputDialog("Enter term "+(i+1)+" of "+term+": "+"Method: axb where a is a coefficient in decimal form, and b is the power in decimal form");
        }
        int low=Integer.parseInt(JOptionPane.showInputDialog("Enter lower limit of integral: "));
        int high=Integer.parseInt(JOptionPane.showInputDialog("Enter the upper limit of integral: "));
        for(int i=0; i<term; i++){
            intValLow[i]=retVal(integral[i],low);
        }
        for(int i=0; i<term; i++){
            intValHigh[i]=retVal(integral[i],high);
        }
        double finValue=0;
        for(int i=0; i<term; i++){
            finValue+=(intValHigh[i]-intValLow[i]);
        }
        JOptionPane.showMessageDialog(null, "The final value of integral is: "+finValue);
    }
}