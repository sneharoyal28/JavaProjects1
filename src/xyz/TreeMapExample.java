package xyz;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // 1. Student marks using TreeMap
        TreeMap<Integer, Integer> studentMarks = new TreeMap<>();
        studentMarks.put(101, 85);
        studentMarks.put(102, 90);
        studentMarks.put(103, 78);

        System.out.println("Student Marks:");
        for (Integer roll : studentMarks.keySet()) {
            System.out.println("Roll No: " + roll + ", Marks: " + studentMarks.get(roll));
        }

        // 2. Search student marks by roll number
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter roll number to search: ");
        int searchRoll = sc.nextInt();

        if (studentMarks.containsKey(searchRoll)) {
            System.out.println("Marks for Roll No " + searchRoll + ": " + studentMarks.get(searchRoll));
        } else {
            System.out.println("Roll No " + searchRoll + " not found.");
        }

        // 3. Simple phone book
        TreeMap<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Varsha", "9876543210");
        phoneBook.put("Honey", "9123456780");
        phoneBook.put("Lucky", "9000011111");

        System.out.println("\nPhone Book:");
        for (String name : phoneBook.keySet()) {
            System.out.println("Name: " + name + ", Phone: " + phoneBook.get(name));
        }

        System.out.print("\nEnter name to search in phone book: ");
        sc.nextLine(); // clear buffer
        String searchName = sc.nextLine();

        if (phoneBook.containsKey(searchName)) {
            System.out.println("Phone number of " + searchName + ": " + phoneBook.get(searchName));
        } else {
            System.out.println(searchName + " not found in phone book.");
        }

        sc.close();
    }
}