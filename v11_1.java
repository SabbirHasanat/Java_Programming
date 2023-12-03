import java.util.Scanner;

public class v11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        //input
        System.out.println("Enter elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter found elements: ");
        int x = sc.nextInt();


        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at location ("+i+","+j+")");
                }
            }
            System.out.println();
        }
    }
}
