import javax.swing.JOptionPane;
class ConvStrArr{
    //Convets every word into array collection string to be copied.
    public static void main(String args[]){
        String str=JOptionPane.showInputDialog("Enter the sentence to be converted into a string: ");
        str+=" ";
        JOptionPane.showMessageDialog(null, "Check the TERMIAL");
        int len=str.length();
        int strt=0;int end=strt;
        for(int i=0; i<len; i++){
            if(str.charAt(i)==' '){
                end=i;
                String arr="`"+str.substring(strt ,end)+"`,";
                System.out.print(arr);
                strt=end+1;
            }
        }

    }
}