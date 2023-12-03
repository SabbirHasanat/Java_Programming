

import java.util.Scanner;

public class V34__asn9 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int n;
        System.out.println("1. Bengali");
        System.out.println("2. Hindi");
        System.out.println("3. Urdu");
        System.out.println("4. English");
        System.out.print("Select a option (1-4): ");
        
        n = i.nextInt();
         
        switch(n){
            case 1:
            System.out.println("Selected language Bengali");
            break;

            case 2:
            System.out.println("Selected language Hindi");
            break;

            case 3:
            System.out.println("Selected language Urdu");
            break;

            case 4:
            System.out.println("Selected language English");
            break;

            default:
            System.out.println("Invalid Option\n");

        }
    }
}
