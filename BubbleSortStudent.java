package jun6;
import java.util.Scanner;

public class BubbleSortStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[5];

        System.out.println("Enter 5 student names:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            students[i] = sc.nextLine();
        }

       
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].compareToIgnoreCase(students[j + 1]) > 0) {
                    String temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted student names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
