public class v26__Integer_Data_Types {
    public static void main(String[] args) {

        byte b1 = -128;  // -128, 127
        short s1 = 20;
        int i1 = 100;
        long l1 = 999L;

        System.out.println("\n"+b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);

        System.out.println();

        System.out.println(b1-i1);
        System.out.println(s1-b1);
        System.out.println(i1-l1);

        System.out.println();

        l1 = i1;
        System.out.println(i1);
        System.out.println(l1);
    }
}
