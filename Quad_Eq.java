import java.util.*;
class Quad_Eq {
    public static void main(String args[]){
        int x= 1;
        while(x==1){
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
            System.out.println("The Roots of the Equation are "+x1+","+x2);
        }
    }
}