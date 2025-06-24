import java.util.*;
class DaystoYears{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days");
        double Days= sc.nextDouble();
        double Year= Days/365;
        System.out.println("The number of years by given number of days is "+Year+" Years");
    }
}