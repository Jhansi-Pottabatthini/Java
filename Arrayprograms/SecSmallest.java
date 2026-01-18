// find second smallest in a given array of elements
public class SecSmallest {
    public static void main(String[] args) {
        int [] arr={5,4,3,9,1,2,8};
        int smallest=arr[0];
        int secsmallest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(smallest>arr[i])
            {
                secsmallest=smallest;
                smallest=arr[i];
            }
            else if(secsmallest>arr[i]||smallest==secsmallest)
            {
                if(smallest!=arr[i])
                {
                    secsmallest=arr[i];
                }
            }

        }
        System.out.println("smallest no is:"+smallest);
        System.out.println("secsmallest no is:"+secsmallest);
    }
}
