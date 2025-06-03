package sneha;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Adding some students to the map
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // Print all students
        System.out.println("Student List:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Example: Search for a student by roll number
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter roll number to search: ");
        int searchRoll = scanner.nextInt();

        if (studentMap.containsKey(searchRoll)) {
            System.out.println("Student Found: " + studentMap.get(searchRoll));
        } else {
            System.out.println("Student with Roll Number " + searchRoll + " not found.");
        }

        scanner.close();
    }
}
