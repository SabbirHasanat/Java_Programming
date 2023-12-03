public class v91 {
    public static void main(String[] args) {

        String s1 = "Sabbir";

        //StringBuffer sb = new StringBuffer("Sabbir");
        StringBuffer sb = new StringBuffer(s1);

        System.out.println(sb);

        sb.append(" Hasanat");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 5);
        System.out.println(sb);
    }
}
