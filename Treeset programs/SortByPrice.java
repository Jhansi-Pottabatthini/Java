import java.util.Comparator;
public class SortByPrice implements Comparator <Mobile>{
    public int compare(Mobile o1,Mobile o2)
    {
        return o1.price.compareTo(o2.price);
    }

    
}
