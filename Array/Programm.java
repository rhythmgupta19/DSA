package Array;
import java.util.Scanner;


import java.util.HashMap;
public class Programm {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<Integer,String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of elements");
        int size = sc.nextInt();

        for(int i = 0;i <size;i++){
            System.out.println("Enter the key in int ");
            int key = sc.nextInt();

            System.out.println("Enter the name ");
            String value = sc.next();

            m.put(key , value);
        }
        System.out.println(m);
    }
}
