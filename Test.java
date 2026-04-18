import java.util.Scanner;
class Calc {
    public int printEven(int[] arr) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the array size");
    int size  = sc.nextInt();

    arr = new int[size];

    for(int i =0;i <size;i++){
        System.out.println("Enter element to enter inside array");
        int ele = sc.nextInt();
        arr[i] = ele;
    }
    System.out.println("Even numbers are:");
    for(int i = 0;i < size;i++){
        if(i % 2 == 0){
            System.out.print(i+ " ");
        }
    }
    sc.close();
    return size;
    } 
}

public class Test {
    
    public static void main(String[] args) {

        Calc obj = new Calc();
        int arr[] = new int[0];
        obj.printEven(arr);
    }
}