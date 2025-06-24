import java.util.Scanner;
class B10toB2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Binary Value: ");
        String Bin=sc.next();
        double Dec=0;
        int n=0;
        for(int i=Bin.length()-1; i>=0; i--){
            int num=Integer.parseInt(Character.toString(Bin.charAt(i)));
            Dec+=(num*(Math.pow(2, n)));
            n++;
        }
        System.out.println("The decimal equivalent is: "+Dec);
    }
}