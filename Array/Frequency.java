// WAP Find te frequency of the array

//  create or take input of an array.
// create an another array freq[] of size 256.
// convert all values into ASCII value.
// iterate an array till freq[i] > 0.
// print all elements.
// end.
package Array;

public class Frequency {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3,2,4,5,4,5,66,5,};
        int freq[] = new int [256];         // Because we're treating numbers like ASCII characters
                                            // Every index/ch initially contains 0
        for(int i :arr){
            char ch = (char)i;      // Converts number into ASCII character
            freq[ch]++;             //Go to index ch and  Increase its value by 1
        }
        for(int i = 0;i < freq.length;i++){
            if(freq[i]>0){
                System.out.println(i + " --> " +freq[i]);
            }
        }
    }
}
