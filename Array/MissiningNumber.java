//  WAP to find a mising number from 1 to n.
package Array;
import java.util.Scanner;
public class MissiningNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of an array ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        for(int i= 0;i < size;i++){
            System.out.println("Enter the elements");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        int max = Integer.MIN_VALUE;

        for(int i:arr){
            if(i >max){
                max = i;
            }
        }
        int sum = (max*(max+1))/2;

        int sumA = 0;
        for(int i:arr){
            sumA += i;
        sc.close();
        }
        System.out.println("missing " +(sum-sumA));
    }
}
