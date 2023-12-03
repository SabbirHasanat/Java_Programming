
import java.util.Scanner;

public class V35__condition_end {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        int n1,n2,large;
        System.out.print("Enter 2 numbers: ");
        n1 = i.nextInt();
        n2 = i.nextInt();

        large = (n1>n2)? n1 : n2;

        System.out.println("Large number = "+large);
    }
}
