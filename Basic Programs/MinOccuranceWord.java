public class MinOccuranceWord {
        public static void main(String [] args)
        {
            String str="Raja Rani Ravi Rani Raja Rani";
            System.out.println(str);
            String [] s=str.split(" ");
            String result=s[0];
            int mincount=s.length;
            for(int i=0;i<s.length;i++)
            {
                int count=0;
                for(int j=0;j<s.length;j++)
                {
                    if(s[i].equals(s[j]))
                    {
                        count++;
                    }
                }
                if(count<mincount)
                {
                    mincount=count;
                    result=s[i];
                }
            }
            System.out.println(result);
        }
    
    }
    

