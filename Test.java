import java.util.Scanner;

public class Test {
    // Read an array from the user and print only even numbers.
    static int[] readArrayAndPrintEvenNumbers() {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the array size.
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Read each array element.
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element :");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        // Print even numbers from the array.
        System.out.println("Printing even numbers from the array:");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        // Call the helper method from main.
        readArrayAndPrintEvenNumbers();
    }
}

