// finding max occurance character from a given string
public class MaxOccChar {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(str);
        System.out.println(maxOcc(str));
    }
    public static char maxOcc(String str)
    {
        char maxchar=' ';
        int maxcount=0;
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
            if(count>maxcount)
            {
                maxcount=count;
                maxchar=ch1;
            }
        }
        return maxchar;
    }
    
}
