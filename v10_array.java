import java.util.*;

public class v10_array {
    public static void main(String[] args) {
        
        //standard style
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.print("Enter elements: ");
        int numbers[] = new int[size];

        int i;
        
        //input
        for(i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        //output
        for(i =0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }

        /*    //1st style
        //int[] marks = new int[3];   // *1st style

        int marks[] = new int[3];    // *2nd style

        marks[0]= 97;
        marks[1]= 98;
        marks[2]= 99;

        System.out.println("Physics= "+marks[0]);
        System.out.println("Chemistry= "+marks[1]);
        System.out.println("Math= "+marks[2]);
        */

        /*//2nd style
        int marks[]={97,98,99}*/


        
    }
}
