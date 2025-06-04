package xxx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(5);
     System.out.println("sorted list :");
        Collections.sort(list);  
        System.out.println(list);  
    }
}
