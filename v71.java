import java.util.Scanner;

public class v71 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int array[] = new int[6];

        array[0]=1; array[1]=2; array[2]=3; array[3]=4; array[4]=5; array[5]=6;

        int len = array.length;
        System.out.println("Array size: "+len);

        double sum= array[0] + array[1] + array[2] + array[3] + array[4] + array[5];
        System.out.println("Sum: "+sum);

        double avg = sum / array.length;
        System.out.println("Avg: "+avg);
    }
}
