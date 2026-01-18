import java.util.Comparator;
public class SortByColor implements Comparator<Mobile>{
    public int compare(Mobile o1,Mobile o2)
    {
        return o1.color.compareTo(o2.color);
    }

    
}
