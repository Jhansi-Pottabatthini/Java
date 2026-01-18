import java.util.*;
class Armstrong
{  
 public static void main(String args[]){  
 Scanner sc=new Scanner(System.in);
  int r,sum=0,n,temp;    
  System.out.println("Enter the number:");
  n=sc.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10;
   sum=(sum*10*10*10);    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("armstrong number ");    
  else    
   System.out.println("not armstrong");    
}  
}  