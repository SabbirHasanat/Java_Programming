import java.util.Scanner;

public class v80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][]= new int[4][5];

        int i,j;
        int k=1; //value printing start hobe form 1.

        // value assign
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                a[i][j] = k;
                k++;
            }
        }

        //printing
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
