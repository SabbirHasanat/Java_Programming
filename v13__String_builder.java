public class v13__String_builder {
    private static final char C = 0;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sabbir");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'C');
        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);


        //append
        StringBuilder sb1 = new StringBuilder("H");
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);

    }
}
