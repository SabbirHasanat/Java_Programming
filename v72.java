
import java.util.Scanner;

public class v72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        int a[]= new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        double sum = 0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }System.out.println("Sum = "+sum);

        double avg= sum/n;
        System.out.println("Avg = "+avg);

    }
}
