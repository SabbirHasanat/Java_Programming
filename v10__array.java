import java.util.Scanner;

public class v10__array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.print("Enter elements: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        System.out.print("printing elements: ");
        for(int i=0;i<size;i++){
            System.out.print(number[i]+" ");
        }
    }
}
