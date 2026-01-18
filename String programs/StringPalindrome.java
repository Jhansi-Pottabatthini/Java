// check whether the given string is palindrome or not
public class StringPalindrome {
    public static void main(String[] args) {
        String str="MAlayaLAm";
        String result="";
        str=str.toLowerCase();
        System.out.println(str);
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            result+=ch;

        }
        if(str.equals(result))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
