package jun16;
import java.util.Scanner;

public class JumpSearchInArrayList {

  
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (prev < n && arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1; 
            }
        }

        while (prev < Math.min(step, n)) {
            if (arr[prev] == target) {
                return prev;
            }
            prev++;
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int index = jumpSearch(arr, target);

        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }

        scanner.close();
    }
}
