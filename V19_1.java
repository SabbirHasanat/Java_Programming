

import java.util.Scanner;

public class V19_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;

        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        double area = 3.1416 * radius* radius;

        System.out.print("\nArea = "+area);
    }
}
