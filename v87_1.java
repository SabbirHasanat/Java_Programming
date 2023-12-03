import java.util.Arrays;
import java.util.Scanner;

public class v87_1 {
    public static void main(String[] args) {
        int a[] = {2,1,6,4,9,0,-1};

        Arrays.sort(a);

        System.out.print("Sorted array: ");
        for(int x:a){
            System.out.print(x+" ");
        }

        System.out.print("\nEnter searching element: ");
        System.out.print("Found at index: "+Arrays.binarySearch( a , new Scanner(System.in).nextInt() ));


    }
}
