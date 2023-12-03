public class Final {
    public int x, y, z;

    public void methodOne() {
        x += 4;
        ++y;
        System.out.println(x);
        System.out.println(y);
    }

    public void methodTwo() {
        x += y;
        y = x - 6;
        System.out.println(y);
    }

    public void methodThree() {
        z += y;
        y = z - 6;
        x = z - y;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Final p = new Final();
        p.x = 44;
        p.methodOne();
        p.y = 3;
        p.methodOne();
        p.methodOne();
        p.methodTwo();
        p.methodTwo();
        p.z = 10;
        p.methodThree();
        p.methodThree();
    }
}
