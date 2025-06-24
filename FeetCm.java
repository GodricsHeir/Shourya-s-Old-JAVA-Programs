import java.util.Scanner;
class FeetCm{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i==0){
			System.out.print("Enter the Feet: ");
			double f=sc.nextDouble();
			System.out.print("Enter the Inches: ");
			double in=sc.nextDouble();
			System.out.println("In cm: "+((f*12*2.54)+(in*2.54)));
		}
	}
}