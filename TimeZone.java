import java.util.*;
class TimeZone{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int TimeZoneHr=0;
        int TimeZoneMin=0;
        System.out.println("Enter Your specific longitude in your range of longitudes only in degrees number: ");
        int Longitude= sc.nextInt();
        System.out.println("Enter 'W' or 'E'");
        char Direction= sc.next().charAt(0);
        if(Direction=='W' || Direction=='w'){ //Had to include both cases as there are mose dumbasses then you might have been led to believe
        TimeZoneHr= (Longitude/15)*-1;
        TimeZoneMin= ((Longitude%15)*60)/15;
        System.out.println("Your UTC value is: "+TimeZoneHr+":"+TimeZoneMin+" UTC");
        }
        else if(Direction=='E' || Direction=='e'){ //Had to include both cases as there are mose dumbasses then you might have been led to believe
        TimeZoneHr= Longitude/15;
        TimeZoneMin= ((Longitude%15)*60)/15;
        System.out.println("Your UTC value is: +"+TimeZoneHr+":"+TimeZoneMin+" UTC"); 
        }
    }
} 