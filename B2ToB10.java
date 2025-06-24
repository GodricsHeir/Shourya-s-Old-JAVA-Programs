import java.util.Scanner;
class Base10ToBase2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n= sc.nextLong();
        long temp=n;
        long Bintemp= 0;
        long MulR= 1;
        long BinFin=0;
        while(temp!=1){
            Bintemp=temp%2;
            temp/=2;
            BinFin+=(Bintemp*MulR);
            MulR*=10;
        }
        if(n!=0)
        BinFin+=(1*MulR);
        System.out.println("Binary version of "+n+" is :"+BinFin);
    }
}