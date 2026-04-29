// WAP to find the third max element from array.
package Array;

public class Programm9 {
    public static void main(String[] args) {
        int arr[] = {23,45,65,76,54,87};
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        int Tmax = Integer.MIN_VALUE;

        for(int i:arr){
            if(i > max){
                Tmax = Smax;
                Smax = max;
                max = i;
            }
            else if(i > Smax && i !=max){
                Tmax =Smax;
                Smax = i;
            }
            else if(i > Tmax && i != Smax && i != max){
                Tmax = i;
            }
        }
        System.out.println("Tnird max is " +Tmax);
        System.out.println("Second max is " +Smax);
        System.out.println("Max is " +max);
    }
}
