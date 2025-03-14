package string.string_methods;

public class SubStringMethod {
    public static void main(String[] args) {

        /*
        String s = "Biradar";
        System.out.println(s.substring(0, 3));
        System.out.println(s.substring(3, 6));
        System.out.println(s.substring(5));*/


        //Example 1
        String s1 = new String("SachinTendulkar");
        System.out.println(s1);
        System.out.println(s1.substring(5));

        String s2 = s1.substring(6, 15);
        System.out.println(s2);

        String s3 = s2.substring(3);
        System.out.println(s3);


        //Example 2
        String s4 = "HelloJava";
        String s5 = s4.substring(5);
        System.out.println(s5);

        String s6 = s4.substring(3, 9);
        System.out.println(s6);

    }
}
