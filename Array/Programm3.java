// WAP to print the element of even index.
package Array;
import java.util.Scanner;
public class Programm3 {
    public static void main(String[] args) {

        // Taking size input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        // creating array.
        int arr[] = new int[size];

        // Taking input of element inside array.
        for(int i = 0;i < size;i++){
            System.out.println("Enter the element inside array");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        // Printing the element of even index.
        System.out.println("Elements of even indexes are:");
        for(int i = 0;i < size;i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
        }
        sc.close();
    }
}
