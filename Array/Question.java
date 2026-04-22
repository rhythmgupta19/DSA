package Array;
//Qn1. Create an integer array of size 5 and take input from the user.

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
// }

