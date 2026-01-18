import java.util.*;
class Prime
{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int n,c=0;
System.out.println("Enter the number:");
n=sc.nextInt();
for(int i=1;i<=n;i++)
if(n%i==0)
c++;
if(c==2)
System.out.println("prime");
else
System.out.println("not a prime");
}
}

