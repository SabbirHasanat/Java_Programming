import java.util.Scanner;

public class v85 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // System.out.print("Start from: ");
        // int n1 = s.nextInt();

        System.out.print("End to: ");
        int n2 = s.nextInt();

        int count = 0;
        for(int i = 2; i<=n2/2; i++){
            if (n2%i==0)
            count++;

            if(count==1)
            System.out.print(" ");
        }
    }
}
