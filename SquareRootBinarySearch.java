package jun5;

import java.util.Scanner;

public class SquareRootBinarySearch {

    public static int squareRoot(int n) {
        if (n < 2) return n;

        int low = 1, high = n, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            } else if (square < n) {
                ans = mid;      
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = squareRoot(n);
        System.out.println("Square root (integer part) of " + n + " is: " + result);

        scanner.close();
    }
}