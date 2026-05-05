// WAP to reverse the array (Two pointer approach)
// logic-->
// create an array or take input.
// intialize two pointer i & j.
// iterate till i < j.
// Store value of i in temp pounter
// or store value of j in arr[i].
// and store temp in arr[j].
// then print elements.
// end 
package Array;

public class Programm11 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9};

        // Intialize two variable i and j.

        int i = arr.length-1;
        int j = 0;

        while(j <i){
            int temp = arr[i];      //Store value of i in temp variable.
            arr[i] = arr[j];        // Store value of j in i.
            arr[j] = temp;          // Assign temp in j
            i--;
            j++;
        }
        for(int k:arr){
            System.out.print(k+ " ");
        }
    }
}
