package string.string_methods;

public class EqualsCase {
    public static void main(String[] args) {

        //Case 1
        String s1 = "Nikhil";
        String s2 = "Nikhil";

        System.out.println(s1.equals(s2));


        //Case 2
        /*
        String s = new String("Hello");
        String upperS = "HELLO";
        String s1 = s.toUpperCase();
        System.out.println(s==s1);  //prints false
        System.out.println(upperS==s1);  //prints false
         */

        //Case 3
        /*
        String s1 = new String("java");
        String s2 = s1.toUpperCase(); //Heap
        String s3 = s1.toLowerCase(); //Heap
        String s4 = s1.substring(1);

        System.out.println(s1==s2); //
        System.out.println(s1==s3); //
        System.out.println(s1==s4);
        */

    }
}
