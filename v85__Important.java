import java.util.ArrayList;

public class v85__Important {
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        ArrayList<Integer> n3 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);
        n1.add(40);
        n1.add(50);
        System.out.println("Number 1: "+n1);

        n2.add(10);
        n2.add(20);
        n2.add(30);
        n2.add(40);
        n2.add(50);
        System.out.println("Number 2: "+n2);

        n3.add(10);
        n3.add(20);
        n3.add(30);
        n3.add(40);
        n3.add(50);

        n3.addAll(n1);
        System.out.println("Number 3: "+n3);

        boolean res = n1.equals(n3);
        System.out.println("N1==N2 : "+res);

    }
}
