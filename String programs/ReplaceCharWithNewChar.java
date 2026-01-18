// program to replace a character with new character
public class ReplaceCharWithNewChar {
    public static void main(String[] args) {
        String str="java";
        char ch1='a';
        char replace='$';
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==ch1)
            {
                result+=replace;
            }
            else{
                result+=ch;
            }
        }
        System.out.println(result);
    }
    
}
