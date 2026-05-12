// WAP to find the second minimum element from array.
package Array;

public class SecondMin {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,78,9};
        int min = Integer.MAX_VALUE;
        int Smin = Integer.MAX_VALUE;

        for(int i:arr){
            if(i < min){
                Smin = min;
                min = i;
            }
            else if(i < Smin && i != min){
                Smin = i;
            }
        }
        System.out.println(Smin);
    }
}
