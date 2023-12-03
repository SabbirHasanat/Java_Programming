import java.util.Scanner;

public class v68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How may line: ");
        int row,col, n=sc.nextInt();

        for(row=1;row<n;row++){
            for(col=1;col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }

    }
}
