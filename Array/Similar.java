// WAP to check aray is same or not....

package Array;

public class Similar {
    public static void main(String[] args) {
        int arr1[] =  {2,5,6,7,8,9};
        int arr2[] = {2,5,6,7,8,9};  
        
            if(arr1.length != arr2.length){
                System.out.println("Array not same");
                return;
            }
            int[] freq = new int[256];
            for(int i:arr1){
                char ch  = (char)i;
                freq[ch]++;
            }
            for(int j:arr2){
                char ch2 = (char)j;
                freq[ch2]--;
            }
            int c = 0;
            for(int i:freq){
                if(i !=0){
                    c++;
                }
            }
            if(c !=0){
                System.out.println("Not same ");
            }
            else{
                System.out.println("Same");
            }
    }   
}
