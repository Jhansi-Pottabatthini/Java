// print frequency of all the elements in a given array
public class FrequencyOfAllTheElements {
    public static void main(String[] args) {
        int [] arr={2,8,5,3,2,1,8};
        for(int i=0;i<arr.length;i++)
        {
            int ele=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(ele==arr[j])
                {
                    count++;
                }

            }
            System.out.println("Freuency of "+arr[i]+" is:"+count);
        }
    }
    
}
