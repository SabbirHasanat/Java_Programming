

public class V18 {
    public static void main(String[] args) {

        int x=3, y=2;

        x+=y;   // x = x + y  =5
        System.out.println("X = "+x);

        x-=y;   // x = x - y   5-2=3
        System.out.println("X = "+x);

        x*=y;   // x = x * y   3*2=6
        System.out.println("X = "+x);

        x/=(float)y;   // x = x / y   6/2=3
        System.out.println("X = "+x);

        x%=y;   // x = x % y   3%2=1
        System.out.println("X = "+x);
    }
}