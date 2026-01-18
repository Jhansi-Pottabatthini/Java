import java.util.*;
class Reverse{  
 public static void main(String args[]){  
 Scanner sc=new Scanner(System.in);
  int r,rev=0,n;    
  System.out.println("Enter the number:");
  n=sc.nextInt();    
  while(n>0){    
   r=n%10;
   rev=(rev*10)+r;    
   n=n/10;    
  }      
   System.out.println(rev);    
}  
}  