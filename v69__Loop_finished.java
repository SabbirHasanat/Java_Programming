import java.util.Scanner;

public class v69__Loop_finished {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();

        int max = n;
        int min = n;

        while(true){
            n = s.nextInt();

            if(n<0)
            break;

            if(n>max)
            max = n;

            if(n<min)
            min = n; 
        }
        System.out.println("min= "+min+", max= "+max);
    }
}
