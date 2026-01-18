// Printing odd characters in a given String
public class PrintOddChar {
    public static void main(String[] args) {
        String s="java program";
        for(int i=0;i<s.length();i++)
        {
            if(i%2!=0)
            {
                System.out.println(s.charAt(i));
            }
        }
    }
}
