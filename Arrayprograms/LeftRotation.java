// perform left rotation for a given array of elements
import java.util.Scanner;
public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        System.out.println("Enter userinput");
        int userinput=sc.nextInt();
        System.out.print("enter elements into an array");
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int [] b=new int[arr.length];
        int k=0;
        for(int i=userinput;i<arr.length;i++)
        {
            b[k++]=arr[i];
        }
        for(int j=0;j<userinput;j++)
        {
            b[k++]=arr[j];
        }
        for(int j=0;j<b.length;j++)
        {
            System.out.print(b[j]+" ");
        }

        
    }

    
}
