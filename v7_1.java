import java.util.Scanner;

public class v7_1 {
    public static int CalculateInput(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Multiplying two numbers: "+CalculateInput(a,b) );
    }
}
