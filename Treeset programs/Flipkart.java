import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
public class Flipkart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean  flag=true;
        while(flag){
            System.out.println("Welcome to flipkart");
            System.out.println("1.Sort by brand\n2.sort by price\n3.sort by color\n4.sort by ram\n5.exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            Mobile m1=new Mobile("oppo",25000.0,"black",8);
            Mobile m2=new Mobile("one plus",201000.0,"grey",5);
            Mobile m3=new Mobile("redmi",30000.0,"blue",7);
            ArrayList <Mobile> a=new ArrayList();
            a.add(m1);
            a.add(m2);
            a.add(m3);
            switch(choice)
            {
                case 1:
                {
                    SortByBrand s=new SortByBrand();
                    TreeSet <Mobile> t=new TreeSet<>(s);
                    t.addAll(a);
                    for(Mobile ele:t)
                    {
                        System.out.println(ele);
                    }
                }
                break;
                case 2:
                {
                    SortByPrice s=new SortByPrice();
                    TreeSet <Mobile> t=new TreeSet<>(s);
                    t.addAll(a);
                    for(Mobile ele:t)
                    {
                        System.out.println(ele);
                    }
                }break;
                case 3:
                {
                    SortByColor s=new SortByColor();
                    TreeSet <Mobile> t=new TreeSet<>(s);
                    t.addAll(a);
                    for(Mobile ele:t)
                    {
                        System.out.println(ele);
                    }

                }
                break;
                case 4:
                {
                    SortByRam s=new SortByRam();
                    TreeSet <Mobile> t=new TreeSet<>(s);
                    t.addAll(a);
                    for(Mobile ele:t)
                    {
                        System.out.println(ele);
                    }
                }
                break;
                case 5:
                {
                    flag=false;
                    System.out.println("Thank you");
                }
                break;
                default:{
                    System.out.println("Dabba fellow enter valid choice");
                }
            }
            System.out.println("============================");
        }
        

    }
    
}
