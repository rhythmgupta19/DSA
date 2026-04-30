    // WAP to check if an Array is sorted or not.
package Array;

public class Programm14 {
    public static void main(String[] args) {
        int arr[] = {23,34,45,56,67,78,89,99};

        boolean isSorted = true;

        for(int i = 1; i < arr.length;i++){
            if(arr[i] < arr[i-1]){      //Compare with previus one
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
