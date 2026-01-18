import java.util.Scanner;
class Inputfromuser
{
public static void main(String args[])
{
int i;
String s;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
s=sc.nextLine();
System.out.println(s);
System.out.println("enter an integer");
i=sc.nextInt();
System.out.println(i);
}
}