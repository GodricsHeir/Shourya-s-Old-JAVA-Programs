import java.util.*;
class Day_Remastered
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an year greater than or equal to 1600");
        int Year= sc.nextInt();
        System.out.println("Enter a month number");
        int Month= sc.nextInt();
        System.out.println("Enter a date of month");
        int Date= sc.nextInt();
        int _1600= 1600; //1600 years have 0 odd days
        int Year2= Year-_1600; //Year reduced to lower than 1600;
        int Year3; //Number of Leap years in 400 year terms
        int Year4=0; //Years left after removing the 400 year leap years
        int Year5; //Leap years in 100 year terms 
        int Year6; //Years left after removing the 100 leap years
        int Year7; //Leap years in 4 year terms 
        int Year8; // Lunar years left
        int Odd_Day1; //gives you the number of odd days from leap years
        int Odd_Day2; //gives the odd days from the lunar years
        int Odd_Day3; //gives the odd days from complete centuries
        int Odd_Day4=0; //gives the odd days from the months 
        int Odd_Day5; //gives the odd days from the date of month
        int Odd_Day6; //gives the semi final Odd day
        int Odd_Day7; //gives the final odd day number
        int Odd_Day8; //to add the extra 1 odd day in greater than 300 part
        String Day=""; //gives the day
        Year3= Year2/400;
        Year4= Year2-Year3;
        Year5= Year4/100;
        Year6= Year4-Year5;
        Year7= Year6/4;
        Year8= Year6-Year7;
        Odd_Day1= Year3*2;
        Odd_Day2= Year5*1;
        Odd_Day3= Year7*2;
        Odd_Day5= Year8*1;
        Odd_Day8= Date%7;
        if(Year%400==0)//Insert Leap Odd Days Switch
        {
             switch(Month){
        
            case 1: Odd_Day4= 0; break; //Jan
            case 2: Odd_Day4= 3; break; //Feb
            case 3: Odd_Day4= 4; break; //Mar
            case 4: Odd_Day4= 0; break; //April
            case 5: Odd_Day4= 2; break; //May
            case 6: Odd_Day4= 5; break; //June
            case 7: Odd_Day4= 0; break; //July
            case 8: Odd_Day4= 3; break; //August
            case 9: Odd_Day4= 6; break; //Sept
            case 10: Odd_Day4= 1; break; //Oct
            case 11: Odd_Day4= 4; break; //Nov
            case 12: Odd_Day4= 0; break; //Dec
        }
           }
        else if(Year%400!=0 && Year%100==0)//Insert Lunar Odd Days Switch
        {
             switch(Month){
        
            case 1: Odd_Day4=0; break; //Jan
            case 2: Odd_Day4= 3; break; //Feb
            case 3: Odd_Day4= 3; break; //Mar
            case 4: Odd_Day4= 6; break; //April
            case 5: Odd_Day4= 1; break; //May
            case 6: Odd_Day4= 4; break; //June
            case 7: Odd_Day4= 6; break; //July
            case 8: Odd_Day4= 2; break; //August
            case 9: Odd_Day4= 5; break; //Sept
            case 10: Odd_Day4= 0; break; //Oct
            case 11: Odd_Day4= 3; break; //Nov
            case 12: Odd_Day4= 0; break; //Dec
        }
        }
        else if(Year%400!=0 && Year%100!=0 && Year%4==0)//Insert Leap Odd Days Switch
        {
             switch(Month){
        
            case 1: Odd_Day4=0; break; //Jan
            case 2: Odd_Day4= 3; break; //Feb
            case 3: Odd_Day4= 4; break; //Mar
            case 4: Odd_Day4= 0; break; //April
            case 5: Odd_Day4= 2; break; //May
            case 6: Odd_Day4= 5; break; //June
            case 7: Odd_Day4= 0; break; //July
            case 8: Odd_Day4= 3; break; //August
            case 9: Odd_Day4= 6; break; //Sept
            case 10: Odd_Day4= 1; break; //Oct
            case 11: Odd_Day4= 4; break; //Nov
            case 12: Odd_Day4= 0; break; //Dec
        }
       }
        else //Insert Lunar Odd Days Switch
        { 
           switch(Month){
        
            case 1: Odd_Day4=0; break; //Jan
            case 2: Odd_Day4= 3; break; //Feb
            case 3: Odd_Day4= 3; break; //Mar
            case 4: Odd_Day4= 6; break; //April
            case 5: Odd_Day4= 1; break; //May
            case 6: Odd_Day4= 4; break; //June
            case 7: Odd_Day4= 6; break; //July
            case 8: Odd_Day4= 2; break; //August
            case 9: Odd_Day4= 5; break; //Sept
            case 10: Odd_Day4= 0; break; //Oct
            case 11: Odd_Day4= 3; break; //Nov
            case 12: Odd_Day4= 0; break; //Dec
    }
}
    
    Odd_Day6= Odd_Day1+Odd_Day2+Odd_Day3+Odd_Day4+Odd_Day5+Odd_Day8;
    Odd_Day7= (Odd_Day6+2)%7;
    switch(Odd_Day7){
        case 0: Day= "Monday"; break;
        case 1: Day= "Tuesday"; break;
        case 2: Day= "Wednesday"; break;
        case 3: Day= "Thursday"; break;
        case 4: Day= "Friday"; break;
        case 5: Day= "Saturday"; break;
        case 6: Day= "Sunday"; break;
    }
        System.out.println("The day is "+Day);
        }
}    