// finding minimum occurance character in a given string
public class MinOccuranceChar {
    public static void main(String[] args) {
        String str="aabacca";
        System.out.println(str);
        System.out.println(minOcc(str));
    }
    public static char minOcc(String str)
    {
        char minchar=' ';
        int mincount=str.length();
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            char ch1=str.charAt(i);
            for(int j=0;j<str.length();j++)
            {
                char ch2=str.charAt(j);
                if(ch1==ch2)
                {
                    count++;
                }
            }
            if(count<mincount)
            {
                mincount=count;
                minchar=ch1;
            }
        }
        return minchar;
    }
}
