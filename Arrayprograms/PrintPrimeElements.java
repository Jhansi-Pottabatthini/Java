// printing prime elements from a given array
import java.util.Scanner;
public class PrintPrimeElements {
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
        for(int i=0;i<arr.length;i++)
        if(prime(arr[i]))
        {
            System.out.println(arr[i]+" is a prime");
        }
        else{
            System.out.println(arr[i]+" not a prime number");
        }

        
    }
    public static boolean prime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
        {
            count++;
        }

        }
        if(count==2)
        {
            return true;
        }
        return false;
        
    }
    
}