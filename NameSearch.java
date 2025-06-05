package jun5;

import java.util.Arrays;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
      
        String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String inputName = scanner.nextLine();
        int index = Arrays.binarySearch(names, inputName);
        if (index >= 0) {
            System.out.println(inputName + " found at index " + index + ".");
        } else {
            System.out.println(inputName + " not found in the list.");
        }

        scanner.close();
    }
}