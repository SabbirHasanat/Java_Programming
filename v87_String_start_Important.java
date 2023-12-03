public class v87_String_start_Important {
    public static void main(String[] args) {
        String s1="Sabbir Hasanat";
        String s2= new String("221-35-1007");

        System.out.println("s1= "+s1);
        System.out.println("S2= "+s2);

        int len1 = s1.length();
        System.out.println("Lenth of s1: "+len1);

        boolean equal = s1.equals(s2);
        System.out.println("S1 equals to S2: "+equal);

        boolean contain  = s1.contains(s2);
        System.out.println("S1 contains s2: "+contain);

        boolean empty = s1.isEmpty();
        System.out.println("S1 is empty: "+empty);
    }
}
