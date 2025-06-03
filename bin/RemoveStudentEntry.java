package sneha;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveStudentEntry {

    public static void main(String[] args) {
        // Create and populate the student map
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Alice");
        studentMap.put(2, "Bob");
        studentMap.put(3, "Charlie");
        studentMap.put(4, "David");
        studentMap.put(5,"Devil");

        System.out.println("Original Student List:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter roll number to remove: ");
        int rollToRemove = scanner.nextInt();

        
        if (studentMap.containsKey(rollToRemove)) {
            String removedName = studentMap.remove(rollToRemove);
            System.out.println("Removed student: " + removedName);
        } else {
            System.out.println("No student found with roll number: " + rollToRemove);
        }

        
        System.out.println("\nUpdated Student List:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        scanner.close();
    }
}
