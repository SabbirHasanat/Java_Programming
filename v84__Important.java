
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class v84__Important {
    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<Integer>();

        //adding elements
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println();
        System.out.println("ArrayList contains: "+a);
        System.out.println("Size: "+a.size());

        //a.clear();  //array er all element clear kora holo

        boolean check = a.isEmpty();
        System.out.println("ArrayList is empty: "+check);

        boolean contain = a.contains(30);
        System.out.println("30 is in the list: "+contain);

        int pos = a.indexOf(40);
        System.out.println("The index of 40 is : "+pos);

        //setting a number in array
        a.set(3,70);
        System.out.println("After setting: "+a);

        //getting a number from array list
        // 1 index a kon element ace eitar dara ber kora jabe
        int x = a.get(0);
        System.out.println("Index 0 : "+x);
    }
}
