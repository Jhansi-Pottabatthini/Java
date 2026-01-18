import java.util.Scanner;
class PrimeNumberRangeLarger
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter lower number");
int lower=sc.nextInt();
System.out.println("enter upper number");
int upper=sc.nextInt();
for(int j=upper;j>=lower;j--)
{
if(prime(j))
{
System.out.println(j);
break;
}
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
