

import java.util.Scanner;

public class V27_1{
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        int y;
        System.out.print("Enter any year: ");
        y = i.nextInt();

        if((y%400==0) || ((y%4==0) && (y%100!=0))){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}
