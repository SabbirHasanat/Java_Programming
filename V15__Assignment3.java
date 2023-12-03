

import java.util.Scanner;

public class V15__Assignment3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //same method a string kaj korena.
          
        // string er jonno alada input method use korte hobe.
        Scanner input_string = new Scanner(System.in);

        int id;
        String price,title, description, category;

        System.out.print("Enter your id: ");
        id = input.nextInt();

        System.out.print("\nEnter title of the phone: ");
        title = input_string.nextLine();

        System.out.print("\nEnter price: ");
        price = input_string.nextLine();

        System.out.print("\nEnter description: ");
        description = input_string.nextLine();

        System.out.print("\nEnter category: ");
        category = input_string.nextLine();

        System.out.println("\nId : "+id);
        System.out.println("Title : "+title);
        System.out.println("Price : "+price);
        System.out.println("Description : "+description);
        System.out.println("Category : "+category);


    }
}
