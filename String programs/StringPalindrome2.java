// check whether given string is palindrome or not without performing reverse operation
import java.util.Scanner;
public class StringPalindrome2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        if(Palindrome(str))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    public static boolean Palindrome(String str)
    {
        str=str.toUpperCase();
        int i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            char ch1=str.charAt(i);
            char ch2=str.charAt(j);
            if(ch1!=ch2)
            {
                return false;
            }
            i++;j--;
        }
        return true;
    }
    
}
