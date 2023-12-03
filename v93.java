
public class v93 {
    public static void main(String[] args) {

        //string unchangeable but stringbuilder changeable
        StringBuilder str = new StringBuilder("Sabbir");
        System.out.println("Str: "+str);

        str.append(" Hasanat");
        System.out.println(str);

        str.delete(2, 5);
        System.out.println(str);
    }
}
