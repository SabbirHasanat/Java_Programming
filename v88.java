public class v88 {
    public static void main(String[] args) {
        String firstname = "Sabbir";
        String lastname = " Hasanat";

        String fullname = firstname + lastname;
        System.out.println("Full Name: "+fullname);

        String fullname2 = firstname.concat(lastname);
        System.out.println("Full Name2: "+fullname2);

        String uppercase = fullname.toUpperCase();
        System.out.println("Uppercase: "+uppercase);

        String lowercase = fullname.toLowerCase();
        System.out.println("Uppercase: "+lowercase);

        boolean First = firstname.startsWith("Sab");
        System.out.println("First = "+First);

        boolean Last = lastname.endsWith("nat");
        System.out.println("lastname = "+Last);

        //string value printing using for each loop
        String name[] = {"sabbir","hsanat","shimul"};
        for(String x : name)
              System.out.println(x);
    }
}
