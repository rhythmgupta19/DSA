package Array;
import java.util.Scanner;
public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i =0;i <size;i++){
            System.out.println("Enter the elements");
            arr[i] = sc.nextInt();
        }
        int product = 1;
        System.out.println("Display elements and product");
        for(int i :arr) {
            product *= i;
            System.out.print(i +" ");
        }
        System.out.println("Product " + product);
        sc.close();
    }
}
