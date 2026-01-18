//WAJP TO PERFORM LINEAR SEARCH
class LinearSearch
{
    public static void main(String[] args) {
        int [] arr={2,6,4,1,9};
        int ele=1;
        System.out.println(linearSearch(arr, ele));
    }
    public static int linearSearch(int [] arr,int ele)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            return i;

        }
        return -1;
    }
}