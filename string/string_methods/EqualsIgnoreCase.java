package string.string_methods;

public class EqualsIgnoreCase {
    public static void main(String[] args) {

        String s1 = "GOOD BYE";
        String s2 = "Good Bye";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}