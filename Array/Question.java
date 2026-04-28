package Array;
//Qn1. Create an integer array of size 5 and take input from the user.

import java.lang.classfile.attribute.StackMapFrameInfo.VerificationTypeInfo;

// import java.util.Scanner;
// public class Questions {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();

//         float arr[] = new float[size];

//         for(int i = 0;i < size;i++ ){
//             System.out.println("Enter the elemnt");
//             arr[i] = sc.nextFloat();
//         }
//         System.out.println("Elements in array are:");
//         for(int i=0;i <size;i++){
//             System.out.print(arr[i]+",");
//         }
//         sc.close();
//     }
    
// }

// Qn2.Create an double array of size 5 and take input from the user.

// import java.util.Scanner;
// public class Question{
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the size of array");
//             int size = sc.nextInt();

//             double arr[] = new double[size];

//             for(int i =0;i < size;i++){
//                 System.out.println("Enter the element");
//                 arr[i] = sc.nextDouble();
//             }
//             System.out.println("Printig element");
//             for(double i :arr){
//                 System.out.println(i);
//             }
//             sc.close();
//         }
// }

// Qn3.Create a string array to store names of 5 students.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int size = sc.nextInt();
//         sc.nextLine();

//         String arr[] = new String[size];

//         for(int i =0;i <size;i++){
//             System.out.println("Enter the elements:");
//             arr[i] = sc.nextLine();
//         }
//         System.out.println("printing elements from array");
//         for(String i :arr){
//             System.out.print(i + ",");
//         }
//         sc.close();
//     }
// }

// Qn4.Create a boolean array and assign true/false values.

// import java.util.Scanner;
// public class Questions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int size = sc.nextInt();

//         boolean arr[] = new boolean[size];

//         for(int i = 0;i < size;i++){
//             System.out.println("Enter elements:");
//             arr[i] = sc.nextBoolean(); 
//         }
//         System.out.println("Printing elements:");
//         for(boolean i : arr){
//             System.out.println(i);
//         }
//         sc.close();
//     }
// }

// Qn5. Create an array and print its default values (without initializing).

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         System.out.println("Printing default value of array:");
//         for(int i:arr){
//             System.out.print(i + " ");
//         }
//     }
// }

// Qn6. Print array elements in reverse order using index loop

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();

//         int arr[] = new int[size];
//         for(int i = 0;i < size;i++){
//             System.out.println("Enter the elements:");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Printing elements of array in reverse order:");
//         for(int i = arr.length-1; i >= 0;i--){
//             System.out.print(arr[i]+",");
//         }
//     }
// }

// Qn7. Print only elements at odd index positions.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of element:");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0; i < size;i++){
//             System.out.println("Enter the elements");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("printing odd numbers from array");
//         for(int i :arr){
//             if( i % 2 != 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// Qn8. Print first and last element of an array.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         System.out.println(arr[0]);
//         System.out.println(arr[arr.length-1]);
//     }
// }

// Qn9.Print all elements along with their index number.

// import java.util.Scanner;
// public  class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i <size;i++){
//             System.out.println("Enter the elemnts:");
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0;i < size;i++){
//             System.out.println("Index "+ i + " and number is "+ arr[i]);
//         }
//         sc.close();
//     }
// }

// Qn10.Print sum of all elements using for-each loop.

// public class Questiion{
//     public static void main(String[] args) {
//         int arr[] = {23,34,45,56,67,78,89,90};

//         int sum = 0;
//         for(int i:arr){
//             sum += i;
//         }
//         System.out.println("Sum is " +sum);

//     }
// }

// Qn11.Count total number of elements using for-each loop.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {1,2,34,5,6,7,8,4,45,56,68};

//         int count = 0;
//         for(int i:arr){
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// Qn12. Find maximum element using for-each loop.

// public class Question{
//     public static void main(String[] args) {
//         double arr[] = {12,34.64,654.65,56,68,76.98,56.987};

//         double max = arr[0];       //Start with first element

//         for(double i:arr){
//             if(i > max){
//                 max = i;
//             }
//         }
//         System.out.println(max);
//     }

//Qn13. Find minimum element using for ewach loop.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {12,345,65,5,67,7876};

//         int min = arr[0];

//         for(int i:arr){
//             if(i < min){
//                 min = i;
//             }
//         }
//         System.out.println(min);
//     }
// }

// Qn15. Store marks of 5 students and display them.

// import java.util.Scanner;
// public class Question{
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the size of array:");
//             int size = sc.nextInt();

//             int arr[] = new int[size];

//             for(int i = 0;i < size;i++){
//                 System.out.println("Enter the marks");
//                 arr[i] = sc.nextInt();
//             }
//             System.out.println("Prtinting marks of student:");
//             for(int i = 0;i <size;i++){
//                 System.out.println(arr[i]);
//             }
//         }
// }

// Qn16. Store 5 names and display them.

// public class Question{
//     public static void main(String[] args) {
//         String arr[] = {"Rhythm","Raunak","Ravi","Shivansh","Shoury"};

//         for(int i = 0;i < arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }

// Qn16. Create an array and print its elements in revere order.

// public class Question{
//     public static void main(String[] args) {
//         float arr[] = {23.32f,23,55,65.45f,765.87f,};

//         for(int i = arr.length-1;i >=0;i--){
//             System.out.println("index " + i +" element " +arr[i]);
//         }
//     }
// }

// Qn17. Take array input and print elelment greater than 50.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         System.out.println("Enter the size of an array:");
//         int size  = sc.nextInt();

//         int arr[] = new int[size]; 
        
//         for(int i = 0;i <size;i++){
//             System.out.println("Enter the elements");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Printing the elements");
//         for(int i :arr){
//             if(i > 50){
//                 System.out.print(i + " ");
//             }
//         }
//         sc.close();
//     } 
// }

// Qn18. Take array input and print sum using both loop for and for each.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {23,43,56,765,765,90};

//         int sum = 0;
//         for(int i = 0;i <arr.length-1;i++){
//             sum += arr[i];
//         }
//         System.out.println("Sum is " +sum);
//     }
// }

// Qn19. Create an array and display it using both loops (compare outputs).

// import java.util.Scanner;

// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array:");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++){
//             System.out.println("Enter the elements:");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Printing elements and index of the array");
//         for(int i =0;i < size;i++){
//             System.out.println("Index " + i + " and element is " +arr[i]);
//         }
//     }
// }

// Qn20. Create two arrays of same size and display both.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {23,45,66,76,87,98,65};
//         double array[] = {123.34,654.54,654.56f,6554};

//         System.out.println("Printing elements of first array");
//         for(double i :array){
//             System.out.print(i+ " ");
//         }
//         System.out.println("Printing elements of secoond array");
//         for(int i:arr){
//             System.out.print(i+ " ");
//         }
//     }
// }

// Qn21. Copy elelments from one array to another and display both.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {12,23,34,45,56,67,78,89};
//         int arr1[] = arr;

//         System.out.println("Printing original array:");
//         for(int i:arr){
//             System.out.print(i + " ");
//         }
//         System.out.println();
//         System.out.println("Printing copied array:");
//         for(int i = 0;i < arr1.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// Qn22. Take array input and print square of each element.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++){
//             System.out.println("Enter the elements in array:");
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Printing the square of numbers:");
//         for(int i:arr){
//             int square = i*i;
//             System.out.println("Squares of "  + i + " is:" + square + " ");
//         }
//     }
// }

// Qn23. 35. Take array input and print cube of each element.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i <size;i++){
//             System.out.println("Enter elements");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Printing cube of the numbers");
//         for(int i:arr){
//             int square = i*i*i;
//             System.out.println("Cube of "+ i + " is " + square);
//         }
//      sc.close()
//     }
// }

// Qn24. Count how many even and odd numbers are present.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {23,34,45,56,57,67,87,88,98,43};

//         int even = 0;
//         int odd = 0;
//         for(int i :arr){
//             if(i % 2 == 0){
//                 even++;
//             }else{
//                 odd++;
//             }
//         }
//         System.out.println("Even count " + even);
//         System.out.println("Odd count " + odd);
//     }
// }

// Qn25. 37. Print elements which are divisible by 3.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++){
//             System.out.println("Enter the elements:");
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("printing the number which is divisble by 3");
//         for(int i :arr){
//             if(i % 3 == 0){
//                 System.out.println(i);
//             }
//         }
//         sc.close();
//     }
// }

// Qn26. Print elements which are greater than average value.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();

//         int arr[] = new int[size];
//         int sum = 0;
//         for(int i = 0;i <size;i++){
//             System.out.println("Enter the elements");
//             arr[i] = sc.nextInt();
//             sum += arr[i];
//         }
//         System.out.println("Sum is " +sum);

//         double average = (double) sum/size;
//         System.out.println("Average is " + average);

//         System.out.println("Printing the number greater than average:");
//         for(int i = 0;i < size;i++){
//             if(arr[i] > average){
//                 System.out.print(arr[i] + ",");
//             }
//         }
//     }
// }

// Qn27. Write a program to count how many times a given element appears in an array.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i <size;i++){
//             System.out.println("Enter the elements");
//             arr[i] = sc.nextInt();
//         }
//         // Element to find.
//         System.out.println("Enter element to count");
//         int ele = sc.nextInt();

//         // Count occurances
//         int count = 0;
//         for(int i =0;i < arr.length;i++){
//             if(arr[i] == ele){
//                 count++;

//             }
//         }
//         System.out.println("Element appers " + count + " times.");
//         sc.close();
//     }
// }

// Qn28. WAP to find min and max elements in array.

// import java.util.Scanner;
// import java.util.Arrays;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++){
//             System.out.println("Enter the elements:");
//             arr[i] = sc.nextInt();
//         }
//         int min = Integer.MAX_VALUE;
//         for(int i:arr){
//             if( i < min){
//                 min = i;
//             }
//         }
//         System.out.println(min);
//         sc.close();
//     }
// }

// Qn29. WAP to find min and max elements in array using sort method.

// import java.util.Scanner;
// import java.util.Arrays;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++){
//             System.out.println("Enter the elements:");
//             arr[i] = sc.nextInt();
//         }
//        Arrays.sort(arr);
//        System.out.println("Min " + arr[0] +" And Max is " + arr[arr.length-1] );
//     }
// }

