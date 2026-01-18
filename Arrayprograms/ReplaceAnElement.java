// replace a given element with a new element
import java.util.Scanner;
public class ReplaceAnElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size=sc.nextInt();
        System.out.println("Enter elements into an array:");
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter which element you want to replace:");
        int ele=sc.nextInt();
        System.out.println("Enter replacing element:");
        int replacing_ele=sc.nextInt();
        int [] res=replace(arr,ele,replacing_ele);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("New array is:"+res[i]);
        }
    }
    public static int [] replace(int [] arr,int ele,int replacing_ele)
    {
        for(int i=0;i<arr.length;i++)
        {
            int ele2=arr[i];
            if(ele==ele2)
            {
                arr[i]=replacing_ele;
            }
        }
        return arr;
    }
    
     
}
