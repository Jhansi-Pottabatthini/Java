// converting given string into lowercase so for that we need add 32 to the every character
public class ConvertIntoLowercase {
    public static void main(String[] args) {
        String str="JHANSi";
        String result="";
        System.out.println(str);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                ch+=32;
                result+=ch;
            }
            else{
                result+=ch;
            }
        }
        System.out.println(result);
    }
    
}
