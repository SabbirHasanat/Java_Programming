import java.util.Arrays;

public class v87 {
    public static void main(String[] args) {

        int[] a = { 5, -2, 23, 7, 87, -42, 509 };

        Arrays.sort(a);

        System.out.print("Sorted array: ");
        for(int x : a){
            System.out.print(x+" ");
        }
        
    }
}
