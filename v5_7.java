public class v5_7 {
    public static void main(String[] args) {

        int num = 1;
        
        extracted(num);
    }

    private static void extracted(int num) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
