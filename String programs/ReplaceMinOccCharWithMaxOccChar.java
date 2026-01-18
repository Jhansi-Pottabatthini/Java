public class ReplaceMinOccCharWithMaxOccChar {
    public static void main(String[] args) {
        String str="abbccb";
        int mincount=str.length();
        char minchar=' ';
        String result="";
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
        System.out.println(minchar);
        int maxcount=0;
        char maxchar=' ';
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
        System.out.println(maxchar);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==minchar)
            {
                result+=maxchar;
            }
            else{
                result+=ch;
            }
        }
        System.out.println(result);
    }
    
}
