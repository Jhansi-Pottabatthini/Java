// print frequency of all characters
public class FrequencyOfAllCharacters {
    public static void main(String[] args) {
        String str="programming";
        for(int i=0;i<str.length();i++)
        {
            char ch1=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                char ch2=str.charAt(j);
                if(ch1==ch2)
                {
                    count++;
                }
            }
            System.out.println(ch1+" frequency is:"+count);
        }
    }
}
