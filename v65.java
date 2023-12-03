

import java.util.Scanner;

public class v65 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n,sum=0,temp,rem;
        System.out.print("Enter a number: ");
        n = s.nextInt();

        temp = n;

        while(temp!=0){
            rem = temp%10;
            sum = sum + rem*rem*rem;
            temp/=10;
        }
        if(n==sum)  System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}
