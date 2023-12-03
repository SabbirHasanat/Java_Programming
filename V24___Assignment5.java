

import java.util.Scanner;

public class V24___Assignment5 {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        int age;

        System.out.print("Enter age: ");
        age = i.nextInt();

        if(age>=18){
            System.out.println("Valid Voter");
        }else{
            System.out.println("Invalid Voter");
        }
    }
}
