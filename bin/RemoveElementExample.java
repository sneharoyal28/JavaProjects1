package sneha;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementExample {
    public static void main(String[] args) {
        // Create and initialize the list
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // Remove by index (e.g., remove element at index 2)
        fruits.remove(2); // Removes "Mango"
        System.out.println("After removing element at index 2: " + fruits);

        // Remove by value (e.g., remove "Banana")
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);
    }
}
