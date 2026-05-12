//WAP to print even elemennt from the give input.
package Array;
import java.util.Scanner;
public class EvenElement{
    public static void main(String[] args){

        // Taking size input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        // Creating array.
        int arr[] = new int[size];

        // Taking input of element from user
        for(int i = 0;i <size;i++){
            System.out.println("Enter the element");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        // Printing only even numbers.
        System.out.println("Even numbers are:");
        for(int i :arr){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}