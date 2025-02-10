package string.string_methods;

public class Intern {
    public static void main(String[] args) {

        //Example 1
        String s1 = "Nikhil";
        String s2 = new String("Nikhil");
        String s3 = s2.intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);


        //Example 1
        String s4 = new String("java").intern();
        String s5 = new String("java").intern();

        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
    }
}