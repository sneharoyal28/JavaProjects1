package sneha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("luna");
        names.add("Charlie");
        names.add("David");

        // Ask user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to check: ");
        String nameToCheck = scanner.nextLine();

        // Check if the name exists (case-sensitive)
        if (names.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the list.");
        } else {
            System.out.println(nameToCheck + " does not exist in the list.");
        }

        scanner.close();
    }
}
