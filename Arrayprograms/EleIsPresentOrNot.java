// check whether given element is present or not
public class EleIsPresentOrNot {
    public static void main(String[] args) {
        int [] arr={1,5,8,3,9,2};
        int ele=2;
        System.out.println(contains(arr,ele));
    }
    public static boolean contains(int [] arr,int ele)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(ele==arr[i])
            {
                return true;
            }
        }
        return false;
    }
    
}
