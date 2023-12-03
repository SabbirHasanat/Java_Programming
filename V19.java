

import java.util.Scanner;

public class V19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base,height;

        System.out.print("Enter Base: ");
        base = input.nextDouble();

        System.out.print("\nEnter Height: ");
        height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.print("\nArea = "+area);

    }
}
