package xxx;
import java.util.Scanner;

public class Studentmarks{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

      
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

       
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        
        System.out.println("\n----- Student Result -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks      : " + marks);

        
        if (marks >= 40) {
            System.out.println("Result     : Pass");
        } else {
            System.out.println("Result     : Fail");
        }

        scanner.close();
    }
}
