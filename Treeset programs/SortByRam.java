import java.util.Comparator;
public class SortByRam implements Comparator<Mobile>{
    public int compare(Mobile o1,Mobile o2)
    {
        return o1.ram-o2.ram;
    }


    
}
