// WAP to sort the array using Selection Sort

package Array;

public class Programm18 {
    
    // Method to perform selection sort
    static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // One by one move the boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element of unsorted portion
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Method to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {12, 232, 43, 54, 56, 23, 18, 2};
        
        selectionSort(arr);
        
        System.out.println("Sorted array using Selection Sort:");
        printArray(arr);
    }
}