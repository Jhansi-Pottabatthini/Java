// check whether the character is present in a given string or not
import java.util.Scanner;
public class CharacterIsPresentOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter a string");
        String str=sc.next();
        System.out.println("Enter a character to fetch");
        char ch1=sc.next().charAt(0);
        System.out.println(Present(str,ch1));
    }
        public static boolean Present(String str,char ch1)
        {
            for(int i=0;i<str.length();i++)
            {
                char ch2=str.charAt(i);
                if(ch1==ch2)
                {
                    return true;
                }
            }
            return false;
        }
}
