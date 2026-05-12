// Selection sort

package Array;

public class Programm19 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,-5,-6,7,-8,65,76};

        for(int i = 0;i < arr.length-1;i++){
            int max = i;

            for(int j = i+1;j < arr.length-1;j++){
                if(arr[j] > arr[max]){
                    max =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            
            for(int r:arr){
                System.out.println(i + " ");
            }
        }
    }
}
