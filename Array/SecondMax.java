// WAP to find second max element from array
// Max transfer its value to Smax in every itration
package Array;
public class SecondMax {
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,9};
        int max = -2147483648;

        int Smax = Integer.MIN_VALUE;

        for(int i:arr){
            if(i > max){
                Smax = max;
                max = i;
            }
            else if(i > max && i!= max){
                Smax = i;
            }
        }
        System.out.println(Smax);
    }
}
