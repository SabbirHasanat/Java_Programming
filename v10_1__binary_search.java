import java.util.Scanner;

public class v10_1__binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int number[] = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            number[i] = sc.nextInt();
        }

        System.out.print("Enter searching elements: ");
        int x = sc.nextInt();

        for(int i=0;i<n;i++){
            if(number[i] == x){
                System.out.println("x found at index: "+ (i+1));
            }
        }
    }
}
