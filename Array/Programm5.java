// WAP to print all even numbers in array using method with parameter with return type.
package Array;

import java.util.Scanner;

class Calc {
    public int printEven(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int size = sc.nextInt();

        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element to enter inside array");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.println("Even numbers are:");
        for (int i :arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
        return size;
    }
}

public class Programm5 {

    public static void main(String[] args) {

        Calc obj = new Calc();
        int arr[] = new int[0];
        int size = obj.printEven(arr);
        System.out.println("size " + size);
    }
}

// WAP to print all even numbers in array using method with parameter with return type.
package Array;

import java.util.Scanner;

class Calc {
    public int printEven(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int size = sc.nextInt();

        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element to enter inside array");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        System.out.println("Even numbers are:");
        for (int i :arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
        return size;
    }
}

public class Programm5 {

    public static void main(String[] args) {

        Calc obj = new Calc();
        int arr[] = new int[0];
        int size = obj.printEven(arr);
        System.out.println("size " + size);
    }
}
