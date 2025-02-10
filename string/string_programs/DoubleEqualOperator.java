package string;

public class DoubleEqualOperator {
    public static void main(String[] args) {


        String s1 = "Nikhil";
        String s2 = "Nikhil";
        String s3 = new String ("Nikhil");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);


        String s4 = new String("Football");
        String s5 = new String("Football");

        String s6 = "Football";
        String s7 = "Football";

        System.out.println(s4 == s5);
        System.out.println(s4 == s6);

        System.out.println(s4 == s7);
        System.out.println(s6 == s7);
    }
}