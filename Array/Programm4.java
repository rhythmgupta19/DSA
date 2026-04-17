//WAP to take a character as a input inside array.
package Array;
import java.util.Scanner;
public class Programm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        char arr[] = new char[size];

        for(int i = 0;i < size;i++){
            System.out.println("Enter the characters");
            char ele = sc.next().charAt(0);
            arr[i] = ele;
        }
        System.out.println("Charcters are:");
        for(char i : arr){
            System.out.print(i+ " ");
        }
        sc.close();
    }
}
