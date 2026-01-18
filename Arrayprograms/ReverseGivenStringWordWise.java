// program to reverse a given string word wise
public class ReverseGivenStringWordWise {
    public static void main(String[] args) {
        String s="Hello Dear Students";
        System.out.println(s);
        String [] str=s.split(" ");
        String result="";
        for(int i=str.length-1;i>=0;i--)
        {
            if(i==0)
            {
                result+=str[i];
            }
            else{
                result+=str[i]+" ";
            }
        }
        System.out.println(result);
    }
    
}
