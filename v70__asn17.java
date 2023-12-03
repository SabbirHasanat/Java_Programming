import java.util.Scanner;

public class v70__asn17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How may line: ");
        int row,col, n=sc.nextInt();

        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                if(col%2!=0) System.out.print(" "+1);
                else System.out.print(" "+0);
            }
            System.out.println();
        }
    }
}
