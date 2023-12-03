

import java.util.Scanner;

public class v50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,fact=1;
        System.out.print("Enter any positive integer: ");
        n = sc.nextInt();

        for(i=1;i<=n;i++){
            fact*=i;
        }System.out.println("Factorial of "+n+" is : "+fact);
    }
}
