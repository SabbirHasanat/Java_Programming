import java.util.Scanner;

public class v68_1__prime_numbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = s.nextInt();

        int i,count=0;
        for(i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        
        if(count==1){
            System.out.print("prime\n");
        }
        else System.out.println("not prime");

    }
}
