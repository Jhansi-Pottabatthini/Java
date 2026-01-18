import java.util.*;  
public class SumOfDigits 
{  
public static void main(String args[])  
{  
int number, rem, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = sc.nextInt();  
while(number > 0)  
{  
rem = number % 10;  
sum = sum + rem;  
number = number / 10;  
}  
System.out.println("Sum of Digits: "+sum);  
}
}