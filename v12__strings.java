import java.util.Scanner;

public class v12__strings {
    public static void main(String[] args) {

        /*//String declearation
        // String name = "Sabbir";
        // String fullName = "Sabbir Hasanat";
        // String sentance = "My name is Sabbir Hasanat";
        */


        /*//Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is " + name);
        */


        //concatenation
        String firstName = "Sabbir";
        String lastName = "Hasanat";
        String fullName = firstName + " " +lastName;

        System.out.println(fullName);
        System.out.println("Length: "+fullName.length());

        
        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i)+"   ");
        }

        //compare
        String name1 = "Sabbir";
        String name2 = "Hasanat";

        if(name1.compareTo(name2) == 0){
            System.out.println("\nStrings are equal");
        } else {
            System.out.println("\nStrings are not equal");
        }


    }
}
