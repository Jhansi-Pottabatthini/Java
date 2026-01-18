// sorting the elements using compare method and store the objects into treeset
public class Mobile{
    String brand;
    Double price;
    String color;
    int ram;
    Mobile(String brand,double price,String color,int ram)
    {
        this.brand=brand;
        this.price=price;
        this.color=color;
        this.ram=ram;
    }
    public String toString()
    {
        return "Brand:"+brand+" Price:"+price+" Color:"+color+" RAM:"+ram;
    }
}