import java.util.Scanner;
class CurrencyArrange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an amount to be converted to notes");
        int Amt= sc.nextInt();
        int TwoTh= 0; //2000
        int FiveHu= 0; //500
        int TwoHu= 0; //200
        int OneHu= 0; //100
        int Fif= 0; //50
        int Twe= 0; //20
        int Ten= 0; //10
        int Fiv= 0; //5
        int Two= 0; //2
        TwoTh= Amt/2000;
        Amt%=2000;
        if(TwoTh>0){
            System.out.println("Two Thousand notes: "+TwoTh);
        }
        FiveHu= Amt/500;
        Amt%=500;
        if(FiveHu>0){
            System.out.println("Five Hundred notes: "+FiveHu);
        }
        TwoHu= Amt/200;
        Amt%=200;
        if(TwoHu>0){
            System.out.println("Two Hundred notes: "+TwoHu);
        }
        OneHu= Amt/100;
        Amt%=100;
        if(OneHu>0){
            System.out.println("One Hundered notes: "+OneHu);
        }
        Fif= Amt/50;
        Amt%=50;
        if(Fif>0){
            System.out.println("Fifty notes: "+Fif);
        }
        Twe= Amt/20;
        Amt%=20;
        if(Twe>0){
            System.out.println("Twenty notes: "+Twe);
        }
        Ten= Amt/10;
        Amt%=10;
        if(Ten>0){
            System.out.println("Ten notes: "+Ten);
        }
        Fiv= Amt/5;
        Amt%=5;
        if(Fiv>0){
            System.out.println("Five notes: "+Fiv);
        }
        Two= Amt/2;
        Amt%=2;
        if(Two>0){
            System.out.println("Two notes: "+Two);
        }
        if(Amt>0){
            System.out.println("One notes: "+Amt);
        }
    }
}