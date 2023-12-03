

import java.util.Scanner;

public class v52_prime_number_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int n,i;
        n = s.nextInt();

        int count = 0;

        for(i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.print("Prime Number");
        }else{
            System.out.print("Not Prime Number");
        }
    }
}
