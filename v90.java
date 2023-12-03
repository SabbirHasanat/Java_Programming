public class v90 {
    public static void main(String[] args) {

        String s1= "Sabbir Hasanat";

        String s2 = s1.replace('i','j');
        System.out.println(s2);

        String s3[] = s1.split(" ");
        //for each loop
        for(String x : s3)
            System.out.println(x);
    }
}
