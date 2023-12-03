import java.util.Scanner;

public class v5_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // In space -> TAB <-
            }

            // Star print
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
