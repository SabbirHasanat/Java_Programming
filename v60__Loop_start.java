import java.util.Scanner;

public class v60__Loop_start {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 to 10 : ");
        int n = s.nextInt();

        while(n<1 || n>10){
            System.out.print(n+" is not between 1 to 10. Try again: ");
            n = s.nextInt();
        }

        System.out.println(n+ " is between 1 to 10. Thanks!");
    }
}
