import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Collections; //array reverse (descending)


import java.util.Scanner;
import java.util.Arrays; // array sorting & many more

public class v82__ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        int i;
        int a[] = new int[n];
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        //Arrays.sort(a, reverseOrder());

        System.out.print("Ascending: ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        System.out.print("\nDecending: ");
        for(i=n-1;i>=0;i--){            // i=n-1 & i>=0 na dile error hobe
            System.out.print(a[i]+" ");
        }
    }
}
