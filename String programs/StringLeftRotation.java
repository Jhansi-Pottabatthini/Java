// perform string left rotation
import java.util.Scanner;
public class StringLeftRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        System.out.println("Enter userinput:");
        int userinput=sc.nextInt();
        System.out.println(str);
        String result="";
        for(int i=userinput;i<str.length();i++)
        {
            char ch1=str.charAt(i);
            result+=ch1;
        }
        System.out.println(result);
        for(int j=0;j<userinput;j++)
        {
            char ch2=str.charAt(j);
            result+=ch2;
        }
        System.out.println(result);
    }
    
}
