
public class v95 {
    public static void main(String[] args) {

        //integer to string
        int i = 100;
        String s = Integer.toString(i); 
        System.out.println("S = "+s);

        
        //string to integer
        String s2 = "32";
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.valueOf(s2);
        System.out.println("I2 = "+i2);
        System.out.println("I3 = "+i3);
    }
}
