package jun10;
public class Insertionsort {



    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i]; 

            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }



    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        System.out.println("Original array:");
        printArray(data);

        insertionSort(data);

        System.out.println("Sorted array:");
        printArray(data);
    }
}
