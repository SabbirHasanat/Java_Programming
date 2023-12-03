

import java.util.Scanner;

public class v51 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n,i;
        System.out.print("Enter any positive integer: ");
        n = s.nextInt();

        for(i=1;i<=10;i++){
            
            // num x i = num*i  --> (5 x 2 = 10) 
            // writing rules👇👇👇
            System.out.println(n+ " x "+i+" = " + n*i);
        }

    }
}
