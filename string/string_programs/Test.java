package string.string_programs;

public class Test {
    public static void main(String[] args) {

        char [] ch = {'a'};

        String str = "a";

        System.out.println(str.equals(String.valueOf(ch)));  //Converts char into String
        System.out.println(str.equals(ch.toString())); //compares Hashcode
    }
}
