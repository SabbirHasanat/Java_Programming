import java.util.Scanner;

public class v84 {
    public static void main(String[] args) {
        System.out.print("Enter your name & age: ");
        System.out.println("Name: "+getName()+"\nAge: "+getAge());

    }
    public static String getName(){
        return new Scanner(System.in).nextLine();
    }

    public static double getAge(){
        return new Scanner(System.in).nextDouble();
    }
}
