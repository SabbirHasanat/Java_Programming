
import java.util.Scanner;

public class V17__Assignment4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int price,numberOfInstallment;
        float installmentPerMonth;

        System.out.println("Enter the Price of Phone: ");
        price = input.nextInt();

        System.out.println("Number of Installment: ");
        numberOfInstallment = input.nextInt();

        installmentPerMonth = price / (float)numberOfInstallment;

        System.out.println("Monthly Installment Amount: "+installmentPerMonth + " euros");

        

    }
}
