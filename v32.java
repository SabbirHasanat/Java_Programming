public class v32 {
    public static void main(String[] args) {

        String s1 = "Sabbir Hasanat";
        System.out.println(s1.toUpperCase());

        String s2 = s1.toLowerCase();
        System.out.println(s2);

        System.out.println(s1);

        System.out.println(s1.isBlank());
        // System.out.println(s1.isEmpty());

        char c = s1.charAt(4);  //start from [0]
        System.out.println(c);

        int i = s1.indexOf('r');   //start from [0]
        System.out.println(i);

        String s3 = s1.concat(" Shimul");
        System.out.println(s3);

        
    }
}
