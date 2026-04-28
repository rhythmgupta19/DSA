// WAP to find the third minimum element from the array.
package Array;

public class Programm10 {
    public static void main(String[] args) {
        int arr[] = {12,34,45,56,67,78,98};
        int min = Integer.MAX_VALUE;
        int Smin = Integer.MAX_VALUE;
        int Tmin = Integer.MAX_VALUE;

        for(int i:arr){
            if(i < min){
                Tmin = Smin;
                Smin = min;
                min = i;
            }
            else if(i < Smin && i != min && Smin < Tmin && Smin != Tmin){
                Smin = min;
                Tmin = Smin;
            }
        }
        System.out.println("Third Minimum is "+ Tmin);
    }
}
