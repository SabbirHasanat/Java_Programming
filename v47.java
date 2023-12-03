

import java.util.Scanner;

public class v47 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        int i,m,n,sum=0;
        System.out.println("\nFor sum of Even numbers from m to n enter values: ");
        
        System.out.print("\nEnter even value for m: ");
        m = sc.nextInt();

        System.out.print("\nEnter any value for n: ");
        n = sc.nextInt();

        if(m%2!=0){
            m = m + 1;
        }
        
        for(i=m;i<=n;i+=2){
            sum+=i;
        }System.out.print("\nSum = "+sum);
    }
}
