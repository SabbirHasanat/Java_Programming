

import java.util.Scanner;

public class V20_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double far,cel;

        System.out.print("Farenhait: ");
        far = sc.nextDouble();

        cel = (far - 32) / 1.8;

        System.out.println("Celsius: "+cel);

    }
}
