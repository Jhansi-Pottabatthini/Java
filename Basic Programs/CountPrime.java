import java.util.*;
class CountPrime
{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int n,c=1;
System.out.println("Enter the number:");
n=sc.nextInt();
for(int i=1;i<=n;i++)
if(n%i==0)
c=c+1;
if(c==2)
System.out.println(c);
else
System.out.println("not a prime");
}
}

