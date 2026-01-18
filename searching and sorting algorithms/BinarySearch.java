// WAJP TO PERFORM BINARY SEARCH
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter elements into an array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search");
        int ele=sc.nextInt();
        System.out.println(binarySearch(arr, ele));

    }
    public static int binarySearch(int [] arr,int ele)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
        int mid=(start+end)/2;
        if(ele==arr[mid])
        return mid;
        if(ele<arr[mid])
        end=mid-1;
        if(ele>arr[mid])
        start=mid+1;
        }
        return -1;

    }
    
}
