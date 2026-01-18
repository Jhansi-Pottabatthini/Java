// print max occurance element from a given array of elements
public class MaxOccuranceElement {
    public static void main(String[] args) {
        int [] a={1,2,1,2,1,3};
        int maxele=0;
        int maxcount=0;
        for(int i=0;i<a.length;i++)
        {
            int ele=a[i];
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(ele==a[i])
                {
                    count++;
                }
            }
            if(count>maxcount)
            {
                maxele=ele;
                maxcount=count;
            }
        }
        System.out.println(maxele);
    }
}
