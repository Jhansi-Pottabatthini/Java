// Summation of given digits in ascii 0-9 is represented as 48-57
public class SummationOfGivenDigits {
    public static void main(String[] args) {
        String str="abc123";
        System.out.println(str);
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9')
            {
                ch-=48;
                sum=sum+ch;
            }
        }
        System.out.println(sum);
    }
    
}
