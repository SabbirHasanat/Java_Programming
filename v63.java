

import java.util.Scanner;

public class v63 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n,rev=0,temp,rem;
        System.out.print("Enter a number: ");
        n = s.nextInt();

        temp = n;

        while(temp!=0){
            rem = temp%10;
            rev = rev * 10 + rem;
            temp/=10;
        }
        
        if(n==rev) System.out.println("Palindrome");

        else  System.out.println("Not Palindrome");
    }
}
