// find second largest from a given array of elements
public class SecLargest {
    public static void main(String[] args) {
        int [] arr={3,6,1,7,8,2,9};
        int largest=arr.length;
        int seclargest=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                seclargest=largest;
                largest=arr[i];
            }
            else if(seclargest<arr[i]||largest==seclargest)
            {
                if(largest!=arr[i])
                {
                    seclargest=arr[i];
                }
            }
        }
        System.out.println("Largest element is:"+largest);
        System.out.println("Second largest element is:"+seclargest);
    }
    
}
