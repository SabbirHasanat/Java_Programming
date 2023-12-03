

import java.util.Scanner;

public class v45__asn11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i,n,fact=1;
        System.out.print("Enter any number: ");
        n = sc.nextInt();

        System.out.printf("\nFactorial of %d is = ",n);
        for(i=1;i<=n;i++){
            fact = fact * i;
        }System.out.print(fact);
    }
}
