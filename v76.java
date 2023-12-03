import java.util.Scanner;

public class v76 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][3];

        int row,col;
        for(row=0;row<2;row++){
            for(col=0;col<3;col++){
                System.out.printf("a[%d][%d]: ",row,col);
                a[row][col] = sc.nextInt();
            }
        }

        System.out.println("Printing matrix: ");
        for(row=0;row<2;row++){
            for(col=0;col<3;col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println();
        }
    }
}
