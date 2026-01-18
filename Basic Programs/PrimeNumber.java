import java.util.Scanner;
class PrimeNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
boolean result=prime(num);
if(result==true)
{
System.out.println("Prime number");
}
else
{
System.out.println("Not a Prime number");
}
}
public static boolean prime(int num)
{
if(num==0||num==1)
{
return false;
}
int res=countdiv(num);
if(res==2)
{
return true;
}
return false;
}
public static int countdiv(int num)
{
int count=0;
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
count++;
}
}
return count;
}
}
