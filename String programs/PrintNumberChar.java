// printing number characters from a given string
public class PrintNumberChar {
    public static void main(String[] args) {
        String str="abc123def";
        System.out.println(str);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9')
            {
                System.out.println(ch);
            }
        }

    }
}
