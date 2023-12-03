import java.util.Scanner;

public class v94 {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 5 };

        System.out.print("Enter a element: ");
        int searchelement = new Scanner(System.in).nextInt();

        System.out.println(getnumberooc(a, searchelement));
    }

    public static int getnumberooc(int a[], int searchelement) {
        int ooc = 0;
        for (int i = 0; i < a.length; i++) {
            if (searchelement == a[i])
                ooc++;
        }

        return ooc;
    }

}