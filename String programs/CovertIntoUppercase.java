// String conversion to uppercase in ascii a-z is represented as 97-122 and A-Z is represented as 65-90 so to convert lowercase uppercase we need to consider difference b/w lower to upper i.e 32
public class CovertIntoUppercase {
    public static void main(String[] args) {
        String str="Jhansi";
        String result="";
        System.out.println(str);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ch-=32;
                result+=ch;
            }
            else{
                result+=ch;
            }
        }
        System.out.println(result);
    }
    
}
