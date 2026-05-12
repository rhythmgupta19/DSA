    // WAP to check if an Array is sorted or not.
    // array is sorted in assceding or descending.
package Array;

public class Sorted {

    public static void main(String[] args) {
        int arr[]  = {23,45,56,67,78,89};

        boolean ascending = true;
        boolean descending = true;

        for(int i = 0;i < arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                ascending = false;
                break;
            }
            if(arr[i] < arr[i+1]){
                descending =  false;
                break;
            }
        }
        if(ascending){
            System.out.println("Array is sorted in asceding order");
        }
        else if(descending){
            System.out.println("Array is sorted in desceding order");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}