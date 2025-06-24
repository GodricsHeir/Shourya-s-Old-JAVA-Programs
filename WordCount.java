import java.util.Scanner;
class WordCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sen= sc.nextLine();
        StringCount(sen);
    }
    public static void StringCount(String sen){
        int Count= 0; //Stores the number of Words
        String Space= " ";
        sen= " "+sen;
        int Length= sen.length();
        for(int i=0; i<(Length-2); i++){
            if((sen.substring(i, i+1)).equals(Space)){
                Count++;
            }
        }
        System.out.println("The number of words in the sentence are: "+Count);
    }
}
