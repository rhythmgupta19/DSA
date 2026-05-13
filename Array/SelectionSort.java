// Create or take an array input.
// firstly assume first index value as minimum.
// Then find minimum in the rest of array.
// Put it in the first position 
// Then find the smallest from the remaining array.
// Put it in the second index.
// Repeat util the array is sorted..

package Array;

public class SelectionSort{
    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11,78};

        for(int i = 0;i <arr.length;i++){
            int min = i;            // Assume first index value is minimum

            for(int j = i+1;j < arr.length;j++){
                    if(arr[j] < arr[min]){
                        min = j;
                    }
            }
            int temp = arr[i];
            arr[i] =  arr[min];
            arr[min] = temp;
        }
        System.out.println("Sorted array in ascending order --> ");
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
// If want to sort array in descending order -->
// Take "max" in the place of min with same logic 