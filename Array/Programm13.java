// WAP to calculate the frequency of the array means how many toimes a number is repeted
package Array;

public class Programm13 {
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,5,6,6,6,7,8,8,11,9,11};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}
