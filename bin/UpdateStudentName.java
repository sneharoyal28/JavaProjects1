package sneha;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UpdateStudentName {

    public static void main(String[] args) {
        // Create and populate the student map
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Alice");
        studentMap.put(2, "Bob");
        studentMap.put(3, "Charlie");
        studentMap.put(4, "David");
        studentMap.put(5, "Eva");

        // Display the original student list
        System.out.println("Original Student List:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter roll number to update the name: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Check if the roll number exists
        if (studentMap.containsKey(rollNumber)) {
            System.out.print("Enter new name for roll number " + rollNumber + ": ");
            String newName = scanner.nextLine();

            // Update the name
            studentMap.put(rollNumber, newName);
            System.out.println("Student name updated successfully.");
        } else {
            System.out.println("Roll number " + rollNumber + " not found.");
        }

        // Display the updated student list
        System.out.println("\nUpdated Student List:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        scanner.close();
    }
}
