// Find te frequency of the array
package Array;

public class Programm13 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3,2,4,5,4,5,66,5,};
        int freq[] = new int [256];         // Because we're treating numbers like ASCII characters

        for(int i :arr){
            char ch = (char)i;      // Converts number into ASCII character
            freq[ch]++;
        }
        for(int i = 0;i < freq.length;i++){
            if(freq[i]>0){
                System.out.println(i + " --> " +freq[i]);
            }
        }
    }
}
