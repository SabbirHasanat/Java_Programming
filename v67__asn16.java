import java.util.Scanner;

public class v67__asn16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,pass=12345;
        String c,user="Sabbir";
        System.out.print("Enter username: ");
        c = s.nextLine();
        System.out.print("Enter password: ");
        n = s.nextInt();

        if(c==user || n==pass) System.out.println("Welcome to the system!");

        else System.out.println("Username/Password is incorrect");

    }
}
