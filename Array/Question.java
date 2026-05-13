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

// Qn29. WAP to print minimum element from the array.

// public class Question{
//     public static void main(String[] args) {
//         int arr[]  = {2,3,4,5,6,7,8,9};

//         int min = Integer.MAX_VALUE;
//         for(int i :arr){
//             if(i < min){
//                 min = i;
//             }
//         }
//         System.out.println("Minimum is "+ min);
//     }
// }

// Qn30. WAP to find largest number in the array.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {23,43,54,65,76,87,98};
//         int max = Integer.MIN_VALUE;
        
//         for(int i:arr){
//             if(i > max){
//                 max = i;
//             }
//         }
//         System.out.println("Maximum is " + max);
//     }
// }

// Qn31. WAP t find second maximum number in array.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {34,24,35,65,76,667,879};

//         int max = Integer.MIN_VALUE;
//         int Smax = Integer.MIN_VALUE;

//         for(int i:arr){
//             if(i > max){
//                 Smax = max;
//                 max  = i;
//             }
//             else if(i > Smax && i != max){
//                 Smax = i;
//             }
//         }
//         System.out.println("Second maximum is " + Smax);
//     }
// }

// Qn32. WAP t find second minimum number in array.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {23,34,53,5,433,3,33,5323,43,};

//         int min = Integer.MAX_VALUE;
//         int Smin = Integer.MAX_VALUE;

//         for(int i :arr){
//             if(i < min){
//                 Smin = min;
//                 min = i;
//             }
//             else if (i < Smin && i != min){
//                 Smin = i;
//             }
//         }
//         System.out.println("Second minimum is "+ Smin);
//     }
// }

// Qn33. WAP to find third maximum number in array.
// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {234,345,543,654,768,755,909};

//         int max = Integer.MIN_VALUE;
//         int Smax = Integer.MIN_VALUE;
//         int Tmax = Integer.MIN_VALUE;

//         for(int i:arr){
//             if(i > max){
//                 Tmax = Smax;
//                 Smax = max;
//                 max = i;
//             }
//             else if(i > Smax && i != max && Smax > Tmax && Smax != Tmax){
//                 Smax = max;
//                 Tmax = Smax;
//             }
//         }
//         System.out.println("Third maximum is " + Tmax);
//     }
// }

// Qn34. WAP to find the third minimum from the array

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {234,534,6544,6,4,6,4,56,4,4,4,98};
        
//         int min = Integer.MAX_VALUE;
//         int Smin = Integer.MAX_VALUE;
//         int Tmin = Integer.MAX_VALUE;

//         for(int i:arr){
//             if(i < min){
//                 Tmin = Smin;
//                 Smin = min;
//                 min = i;
//             }
//             else if( i < Smin && i != min && Smin < Tmin && Smin != Tmin){
//                 Smin = min;
//                 Tmin = Smin;

//             }
//         }
//         System.out.println("First minimum is " +min);
//         System.out.println("Second minimum is " +Smin);
//         System.out.println("Third minimum is " +Tmin);
//     }
// }

// Qn35. WAP to reverse the array.
// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {23,43,54,65,87,87,56};

//         int i = arr.length-1;
//         int j = 0;

//         while(j < i){
//             int temp = arr[i];
//             arr[i] = arr[j]; 
//             arr[j] = temp;
//             i--;
//             j++;
//         }
//         for(int k:arr){
//             System.out.print(k + " ");
//         }
//     }
// }

//Qn.36 WAP to check if an Array is sorted or not.

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {23,24,232,43,54,766,877};

//         boolean isSorted = true;
//         for(int i =1;i <arr.length;i++){
//             if(arr[i] < arr[i-1]){
//                 isSorted = false;
//                 break;
//             }
//         }
//         if(isSorted){
//             System.out.println("Array is sorted ");
//         }
//         else{
//             System.out.println("Array is not sorted ");
//         }
//     }
// }

//Qn 37.  Find te frequency of the array

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {2,3,4,5,6,77,6,5,77,3};
//         int freq[] = new int[256];          // Size 256 because we are treating number as ASCII charchter.

//         for(int i:arr){
//             char ch =(char)i;           // 
//             freq[ch]++;
//         }
//         for(int i= 0;i <freq.length;i++){
//             if(freq[i] > 0){
//                 System.out.println(i + " --> " + freq[i]);
//             }
//         }
//     }
// }

// Qn38. WAP To find 4th minimum element of the array

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the size of an array");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++){
//             System.out.println("Enter the elements: ");
//             arr[i] = sc.nextInt();
//         }
//         int min= Integer.MAX_VALUE;
//         int Smin = Integer.MAX_VALUE;
//         int Tmin = Integer.MAX_VALUE;
//         int Fmin = Integer.MAX_VALUE;

//         for(int i :arr){
//             if(i < min){
//                 Fmin = Tmin;
//                 Tmin = Smin;
//                 Smin = min;
//                 min = i;
//             }
//             else if(i<Smin && i != min){
//                 Fmin = Tmin;
//                 Tmin = Smin;
//                 Smin = i;
//             }
//             else if( i < Tmin && i != Smin && i != min){
//                 Fmin = Tmin;
//                 Tmin = i;
//             }
//             else if(i < Fmin && i != Tmin && i != Smin && i != min){
//                 Fmin = i;
//             }
//         }
//         System.out.println("Min is "+ min);
//         System.out.println("Second min is " + Smin);
//         System.out.println("Third min is " + Tmin);
//         System.out.println("Fourth min is " + Fmin);
//     }
// }

// Qn 39. WAP to reverse the array (2 pointer approach).

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i =0;i < size;i++){
//             arr[i] = sc.nextInt();  
//         }
//         int i  = arr.length-1;
//         int j = 0;
//         while(i > j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             j++;
//             i--;
//         }
//         for(int k:arr){
//             System.out.print(k + " ");
//         }
//     }
// }

// Qn 40. WAP to calculate sum and average of an array.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array:");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i= 0;i <size;i++){
//             System.out.println("Enter the elements:");
//             arr[i] = sc.nextInt();
//         }
//         int count = 0;
//         int sum = 0;
//         for(int j:arr){
//             sum += j;
//             count++;
//         }
//         System.out.println("Sum is " +sum);
//         System.out.println("Count is "+ count);
//         float average = sum/count;
//         System.out.println("Average is "+ average);
//     }
// }

// Qn41.  Find the frequncy of the array.

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array:");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++){
//             System.out.println("Enter the elements");
//             arr[i] = sc.nextInt();
//         }

//         int freq[] = new int[256];

//         for(int i: arr){
//             char ch = (char)i;
//             freq[ch]++;             //Go to index ch and increase its value by 1
//         }
//         for(int i = 0;i < freq.length;i++){
//             if(freq[i] > 0){
//                 System.out.println(i + " --> " + freq[i]);
//             }
//             sc.close();
//         }
//     }
// }

//Qn.42 Check if  array is sorted or not

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array:");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0;i < size;i++){
//             arr[i] = sc.nextInt();
//         }
//         boolean isSorted = true;
//         for(int i= 0;i <size;i++){
//             if(arr[i] < arr[i+1]){
//              isSorted = true;
//              break;
//             }
//             if(isSorted){
//                 System.out.println("Array is sorted");
//             }
//             else{
//                 System.out.println("Array is not sorted");
//             }
//         }
//     }
// } 

// Qn43. WAP to check an array are equal or not.?

// public class Question{
//     public static void main(String[] args) {
//         int arr1[] = {2,3,4,5,6,7,8};
//         int arr2[] = {2,3,4,5,6,7,8};

//         if(arr1.length != arr2.length){
//             System.out.println("Array is not equal");
//             return;
//         }
//         int freq[] = new int[256];
//         for(int i:arr1){
//             char ch = (char)i;
//             freq[ch]++;
//         }
//         for(int j:arr2){
//             char ch = (char)j;
//             freq[ch]--;
//         }
//         int c = 0;
//         for(int i:freq){
//             if(c != 0){
//                 c++;
//             }
//         }
//         if(c != 0){
//             System.out.println("Array is  same");
//         }
//         else{
//             System.out.println("Array is not same");
//         }
//     }
// }

// WAP to claculate frequency of the given array 

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int size = sc.nextInt();

//         int arr[] =new int[size];

//         for(int i= 0;i < size;i++){
//             System.out.println("Enter the element into array");
//             arr[i] = sc.nextInt();
//         }

//         int freq[] = new int[256];

//         for(int j :arr){
//             char ch = (char)j;
//             freq[ch]++;         // i now convert into ch
//         }
//         for(int j = 0;j < freq.length;j++){
//             if(freq[j] > 0){
//                 System.out.println(j + " ---> " + freq[j]);
//             }
//         }
//     }
// }

// WAP to check that the array is sorted or not..

// import java.util.Scanner;
// public class Question{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int size = sc.nextInt();

//         int arr[] = new int[size];

//         for(int i = 0; i < size;i++){
//             arr[i] = sc.nextInt();
//             sc.close();
//         }

//         boolean ascending = true;
//         boolean descending = true;

//         for(int i:arr){
//             if(arr[i] > arr[i+1]){
//                 ascending = false;
//                 break;
//             }
//             if(arr[i] < arr[i+1]){
//                 descending = false;
//                 break;
//             }
//         }
//         if(ascending){
//             System.out.println("Array is sorted in ascending order");
//         }
//         else if(descending){
//             System.out.println("Array is sortedin descending");
//         }
//         else{
//             System.out.println("Array is not sorted");
//         }
//     }
// }

// WAP to reverse array
// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {23,45,67,89,29,87,65,43,2233};

//         int  i = arr.length-1;
//         int j = 0;

//         while(j < i){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i--;
//             j++;
//         }
//         for(int k :arr){
//             System.out.print(k + " ");
//         }
//     }
// }

//  WAP to check array is same or not

// public class Question{
//     public static void main(String[] args) {
//         int arr1[] = {23,45,56,67,78,89,98,44};
//         int arr2[] = {43,56,45,76,87,98,90,34};

//         if(arr1.length != arr2.length){
//             System.out.println("Array is not same");
//         }
//         int freq[] = new int[256];

//         for(int i :arr1){
//             char ch1 =(char)i;
//             freq[ch1]++;
//         }
//         for(int j :arr2){
//             char ch2 = (char)j;
//             freq[ch2]--;
//         }
//         int c = 0;
//         for(int i :freq){
//             if(i != 0){
//                 c++;
//             }
//         }
//         if(c != 0){
//             System.out.println("Array is not same");
//         }
//         else{
//             System.out.println("Array is same");
//         }
//     }
// }

// WAP to find misiing numbers btw 1 to n nums..

// public class Question{
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,7,8,9,10,11,12,13};

//         int max = Integer.MIN_VALUE;
//         for(int i :arr){
//             if(i > max){
//                 max = i;
//             }
//         }
//         System.out.println("Max is " + max);
//         int sum = (max*(max+1)/2);
//         System.out.println("Sum is "+ sum);

//         int sumA = 0;
//         for(int i: arr){
//             sumA += i;
//         }
//         System.out.println("Sum of array is " + sumA);
//         System.out.println("Missing is " + (sum - sumA));
//     }
// }

// Sort the array using selection sort.
public class Question{
    public static void main(String[] args) {
        int [] arr = {23,3,45,65,6,7,9,88,876,987,77,66,5443,};

        for(int i = 0;i < arr.length;i++){
            int max = i;
            for(int j = i+1;j < arr.length;j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        System.out.println("Sorted array in descending order -->");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}