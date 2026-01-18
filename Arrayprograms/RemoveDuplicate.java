// removing duplicate elements from a given array
public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] a={1,7,4,2,1,9,4};
        int [] b=new int[a.length];
        int k=0;
    
        for(int i=0;i<a.length;i++)
        {
            int ele=a[i];
            if(!contains(b,ele))
            {
                b[k++]=a[i];
            }
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
    public static boolean contains(int [] a,int ele)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==ele)
            {
                return true;
            }
        }
        return false;
    }
    
}
