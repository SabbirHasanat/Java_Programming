

import java.util.Scanner;

public class V14_1___Taking_Input {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double num1;

        System.out.print("Enter any double value: ");
        
        num1 = input.nextDouble();

        System.out.println("\nNum1 = "+num1);
    }
}

/*public class V14_1__Taking_Input {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String name;

        System.out.print("Enter your name: ");
        name = input.nextLine();   //nextline use a space soho string nea jai.

        //name = input.next()  --> just next nule space er porer ongsho print hobena.

        System.out.println("\nWelcome : "+name);
    }
} */