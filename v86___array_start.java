import java.util.Scanner;

public class v86___array_start {
    public static void main(String[] args) {

        //for al input
        Scanner s = new Scanner(System.in);

        //for a specific array
        int a[] = new int[100];

        System.out.print("Enter size: ");
        int n = s.nextInt();

        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }

        System.out.println("Arrays: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }



    }
}
