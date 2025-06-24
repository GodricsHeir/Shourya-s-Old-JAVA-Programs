import java.util.Scanner;
class Quad_Eq_Solve{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of 'a'");
        int a= sc.nextInt();
        System.out.println("Enter the value of 'b'");
        int b= sc.nextInt();
        System.out.println("Enter the value of 'c'");
        int c= sc.nextInt();
        double x1; //gives the root for the positive value
        double x2; //gives the root for the negative value
        int  b2= b*b;
        int Neg_B= b*-1;
        double root_stuff= Math.sqrt(b2-(4*a*c));
        x1= (Neg_B+root_stuff)/(2*a);
        x2= (Neg_B-root_stuff)/(2*a);
        double x1Pow2= x1*x1;
        double x2Pow2= x2*x2;
        //We are taking the equation to be in ax2+bx+c format
        if(((a*x1Pow2)+(b*x1)+c)==0 && (((a*x2Pow2)+b*x2)+c)!=0)
        System.out.println(+x1+" is the only correct root");
        else if(((a*x1Pow2)+(b*x1)+c)!=0 && (((a*x2Pow2)+b*x2)+c)==0)
        System.out.println(+x2+" is the only correct root");
        else if(((a*x1Pow2)+(b*x1)+c)==0 && (((a*x2Pow2)+b*x2)+c)==0)
        System.out.println("Both the roots "+x1+" and "+x2+" are the correct roots");
        else
        System.out.println("Equation is unsolvable");
    }
}