// print frequency of all characters after elimination of repeated characters from a given string 
public class FrequencyOfCharAfterEliminationOfRepeatedChars {
    public static void main(String[] args) {
        String str="programming";
        String rem=remDup(str);
        System.out.println(rem);
        for(int i=0;i<rem.length();i++)
        {
            int count=0;
            char ch1=rem.charAt(i);
            for(int j=0;j<rem.length();j++)
            {
                char ch2=rem.charAt(j);
                if(ch1==ch2)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static String remDup(String str)
    {
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!result.contains(ch+""))
            {
                result+=ch;
            }
        }
        return result;
    }
    
}
