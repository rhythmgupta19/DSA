// Insertion sort
package Array;

public class InsertionSort {
    public static void main(String[] args) {

        // Given unsorted array
        int arr[] = { 5, 2, 9, 1, 6, 3 };

        /*
         * Insertion Sort Logic:
         * We assume the first element is already sorted.
         * Then we pick one element at a time from the unsorted part
         * and insert it at its correct position in the sorted part.
         */

        // Start from index 1 because index 0 is considered already sorted
        for (int i = 1; i < arr.length; i++) {

            // Store the current element that we want to insert
            int key = arr[i];

            // j points to the last element of the sorted part
            int j = i - 1;

            /*
             * Move elements of the sorted part one position ahead
             * if they are greater than key.
             */
            while (j >= 0 && arr[j] > key) {

                // Shift bigger element to the right
                arr[j + 1] = arr[j];

                // Move j one step left
                j--;
            }

            /*
             * Now correct position for key is found.
             * Insert key at j + 1.
             */
            arr[j + 1] = key;
        }

        // Print sorted array
        System.out.println("Sorted array:");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}