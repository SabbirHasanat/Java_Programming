import java.util.ArrayList;

public class v83__arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<Integer>();

        //adding elements
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        //1st
        /*System.out.println(a);*/

        
        //2nd
        //for each loop 
        //(size na dea thakle ei loop use hoi)
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println("\nSize = "+a.size());
    }
}
