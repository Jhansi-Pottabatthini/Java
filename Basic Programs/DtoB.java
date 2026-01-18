import java.util.*;
class DtoB
{
public static void main(String a[]){
Scanner sc=new Scanner(System.in);
int n,r,s=0,k;
System.out.println("Enter n value:");
n=sc.nextInt();
while(n!=0)
r=n%2;
s=r*pow(10,k)+s;
k=k+1;
n=n/2;
System.out.println(s);
}
}

