import java.util.Scanner;

public class v7_2___factorial {

    public static void factorial(){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;

        if(n<0) System.out.println("Invalid Numbers");

        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        
        factorial();

    }
}
