

import java.util.Scanner;

public class v56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fibo,i,n,n1=0,n2=1;
        System.out.print("How many numbers: ");
        n = input.nextInt();

        System.out.print("Fibonacci series: "+n1+" "+n2);

        for(i=2;i<n;i++){
            fibo = n1 + n2;
            System.out.print(" "+fibo);
            n1 = n2;
            n2 = fibo;
        }
    }
}
