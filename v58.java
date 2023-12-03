import java.util.Scanner;

public class v58 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter a four digit number: ");
        int n = s.nextInt();

        if(!(n>999) ) 
            System.out.println("not four digit number");
        
        else {
        int n1 = n % 10;
        int n2 = (n / 10) % 10;
        int n3 = (n / 100) % 10;
        int n4 = (n / 1000) % 10;

        if( n1+n2 == n3+n4 ) System.out.println("lucky");
        else System.out.println("not lucky");
        }

        

    }
}
