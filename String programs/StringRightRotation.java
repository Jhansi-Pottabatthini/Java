// perform right rotation in a given string
public class StringRightRotation {
    public static void main(String[] args) {
        String str="program";
        System.out.println(str);
        String result="";
        int userinput=1;
        for(int i=str.length()-userinput;i<str.length();i++)
        {
            char ch1=str.charAt(i);
            result+=ch1;
        }
        System.out.println(result);
        for(int j=0;j<str.length()-userinput;j++)
        {
            char ch2=str.charAt(j);
            result+=ch2;
        }
        System.out.println(result);
    }
    
}
