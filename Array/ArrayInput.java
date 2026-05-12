package Array;
// Inn this programm we are taking input size,creating array;taking element input from user and print all element.
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args){
        // Taking size input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        // Creating arr of integer type.
        int arr[] =  new int[size];

        // Taking input of element inside array.
        for(int i = 0;i < size;i++){
            System.out.println("Enter the element of array");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        // Print element of array.
        for(int i = 0;i <size;i++){                 
            System.out.println(arr[i]);         //This point to indexes
        }
        sc.close();
    }
}

// We can also write like this to print element of array.
// for(int i:arr){                      // This point to elements
//     System.out.println(i);   
// }
