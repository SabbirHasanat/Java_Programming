

import java.util.Scanner;

public class V20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cel,far;

        System.out.print("Celsius: ");
        cel = sc.nextDouble();

        far = 1.8 * cel + 32;

        System.out.println("Farenhait: "+far);


    }
}
