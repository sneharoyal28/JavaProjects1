package jun5;

import java.util.Scanner;
import java.util.TreeSet;

public class ProductionSet {
    public static void main(String[] args) {

        TreeSet<String> products = new TreeSet<>();
        products.add("keyboard");
        products.add("mouse");
        products.add("monitor");
        products.add("cpu");
        products.add("webcam");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a product name to search: ");
        String input = scanner.nextLine().toLowerCase(); 

        if (products.contains(input)) {
            System.out.println("Product \"" + input + "\" is available.");
        } else {
            System.out.println("Product \"" + input + "\" is NOT available.");
        }

        scanner.close();
    }
}
