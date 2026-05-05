    // WAP to check if an Array is sorted or not.
    // This is for ascending order 
package Array;

// public class Programm14 {
//     public static void main(String[] args) {
//         int arr[] = {23,34,45,56,67,78,89,99};

//         boolean isSorted = true;

//         for(int i = 1; i < arr.length;i++){
//             if(arr[i] < arr[i+1]){              //Compare with next one
//                 isSorted = true;
//                 break;
//             }
//         }
//         if(isSorted){
//             System.out.println("Array is sorted in acseding order");
//         }
//         else{
//             System.out.println("Array is not sorted");
//         }
//     }
// }


public class Programm14{
    public static void main(String[] args) {
        int arr [] ={98,87,65,54,44,33,22,11};
        boolean isSorted = true;
        
        for(int i = 0 ; i <arr.length;i++){
            if(arr[i] > arr[i+1]){
                isSorted = true; 
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted in descending order");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}