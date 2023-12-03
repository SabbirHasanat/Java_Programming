import java.util.Scanner;

public class v7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        
        printMyName(name);
    }

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
}
