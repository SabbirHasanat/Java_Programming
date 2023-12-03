import java.util.Scanner;

public class v68 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();

        int i, sum = 0;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        System.out.println(sum == 1 ? "prime" : "not prime");
    }
}
