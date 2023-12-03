import java.util.Scanner;

public class v68_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();

        int i;

        boolean isPrime = true;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                isPrime = false;
                break;
            }
            System.out.println(isPrime? "prime" : "not prime");
        }
    }
}
