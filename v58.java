

import java.util.Scanner;

public class v58 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,n,temp,r,sum=0;
        System.out.print("Enter a number: ");
        n = s.nextInt();
        
        //sorasori mul number niye kaj korbona,
        // tai temp er moddhe n er value rekhe seita niye kaj korbo.
        temp = n;

        while(temp!=0){
            r = temp%10;
            sum+=r;
            temp/=10;
        }System.out.println("Sum = "+sum);
    }
}
