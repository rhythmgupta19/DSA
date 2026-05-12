// Find the sum and average of all elements

package Array;

public class SumAndAverage {
    public static void main(String[] args) {
        int  arr[] = {23,34,45,56,67,78,89};

        int count = 0;
        int  sum = 0;
        for(int i:arr){
            sum = sum+i;
            count++;
        }
        System.out.println(sum);
        System.out.println("Count is " +count);
        int average = sum/count;
        System.out.println("Average is "+ average);
    }
}
