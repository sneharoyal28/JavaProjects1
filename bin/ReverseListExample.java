package sneha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListExample {
    public static void main(String[] args) {
        // Create a list with some elements
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Reverse the list
        Collections.reverse(numbers);

        System.out.println("Reversed List: " + numbers);
    }
}
