import java.util.Scanner;

public class v10_1_Linear_Search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        int a[] = new int[100];

        int i,n1;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Searching elements: " + "\n");
        n1=sc.nextInt();

        for(i=0;i<n;i++){
            if(a[i]==n1){ 
                System.out.println(n1+" found at "+ (i+1) );  
                break; 
            }
        }
        if(i==n) System.out.println("Not found");
    }
}
