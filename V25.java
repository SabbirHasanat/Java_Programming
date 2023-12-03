

import java.util.Scanner;

public class V25 {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        int n;
        System.out.print("Enter any integer number: ");
        n = i.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
