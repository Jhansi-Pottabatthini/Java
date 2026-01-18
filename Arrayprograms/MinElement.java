// find minimum occurance element from a given array of elements
public class MinElement {
    public static void main(String[] args) {
        int [] a={5,8,6,5,8,5};
        int minele=0;
        int mincount=a.length;
        for(int i=0;i<a.length;i++)
        {
            int ele=a[i];
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(ele==a[j])
                count++;
                
            }
            if(count<mincount)
            {
                minele=ele;
                mincount=count;
            }
        }
        System.out.println(minele);
    }
    
}
