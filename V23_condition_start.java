

import java.util.Scanner;

public class V23_condition_start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter any integer number: ");
        n = sc.nextInt();

        if(n>0){
            System.out.println("Positive");
        }else if(n<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
       
    }
}
