// possible substrings using loops
public class PossibleSubStringsUsingLoops {
    public static void main(String[] args) {
        String str="abc";
        for(int i=0;i<str.length();i++)
        {
            String result="";
            for(int j=i;j<str.length();j++)
            {
                char ch=str.charAt(j);
                result+=ch;
                System.out.println(result);
            }
        }
    }
    
}
