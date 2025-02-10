package string.string_methods;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Dhan";
        String s2 = "bad";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        String s4 = "Hello";
        s1.concat("Java");
        System.out.println(s4); // Hello
    }
}