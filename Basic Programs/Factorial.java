import java.util.*;
class Factorial
{
public static void main(String a[]) {
Scanner sc=new Scanner(System.in);
int f=1,i,n;
System.out.println("Enter the number:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("Factorial is:"+f);
}
}