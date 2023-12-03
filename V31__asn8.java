

import java.util.Scanner;

public class V31__asn8 {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        char Q1,Q2;

        System.out.println("Have you completed your masters (y/Y/n/N) ?");
        System.out.print("Ans: ");
        Q1 = i.next().charAt(0);

        System.out.println("Are you fluent in English (y/Y/n/N) ?");
        System.out.print("Ans: ");
        Q2 = i.next().charAt(0);

        if((Q1=='y' || Q1=='Y') && (Q2=='y' || Q2=='Y')){
            System.out.println("\nYou are eligible for the job interview");
        }else{
            System.out.println("\nYou are not eligible for job interview");
        }
    }
}
