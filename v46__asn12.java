

import java.util.Scanner;

public class v46__asn12 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        int i,m,n,sum=0;
        System.out.println("\nFor sum of odd numbers from m to n enter values: ");
        
        System.out.print("\nEnter odd value for m: ");
        m = sc.nextInt();
        while(m%2==0){
            System.out.print("\nWrong! Enter odd value for m: ");
            m = sc.nextInt();
        }

        System.out.print("\nEnter any value for n: ");
        n = sc.nextInt();

        
        for(i=m;i<=n;i+=2){
            sum+=i;
        }System.out.print("\nSum = "+sum);

    }
}
