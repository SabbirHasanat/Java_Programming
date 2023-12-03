

import java.util.*;

public class V30___Assignment7 {
    public static void main(String[] args){

        Scanner i = new Scanner(System.in);
        char ch;
        System.out.print("Do you love java? (y/Y/n/N) : ");
        ch = i.next().charAt(0);

        if(ch=='y' || ch=='Y'){
            System.out.println("You are a java lover");
        }else{
            System.out.println("You are not a java lover");
        }
    }
}
