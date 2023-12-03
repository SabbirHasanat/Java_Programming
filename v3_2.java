import java.util.Scanner;

public class v3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if(a>b) System.out.println("A is Greater than B");
        else if(a==b) System.out.println("A Equal bto B");
        else System.out.println("A is Lesser than B");
    }
}
