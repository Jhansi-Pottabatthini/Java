// reverse the given string
public class ReverseString {
    public static void main(String[] args) {
        String str="jhansi";
        System.out.println(str);
        String result="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            result+=ch;
        }
        System.out.println(result);
    }
    
}
