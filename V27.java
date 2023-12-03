

import java.util.Scanner;

public class V27 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter: ");
        ch = i.next().charAt(0); // jsut zero tomo position er number nibe

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }


    }
}
