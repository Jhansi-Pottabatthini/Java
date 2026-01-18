import java.util.Comparator;
public class SortByBrand implements Comparator<Mobile> {
    public int compare(Mobile o1,Mobile o2)
    {
        return o1.brand.compareTo(o2.brand);
    }

    
}
