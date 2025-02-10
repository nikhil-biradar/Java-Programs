package stringbuilder.stringbuildermethods;

public class Equals {
    public static void main(String[] args) {

        //StringBuilder
        StringBuilder sb1 = new StringBuilder("Nikhil");
        StringBuilder sb2 = new StringBuilder("Nikhil");

        //StringBuffer
        StringBuffer sb3 = new StringBuffer("Biradar");
        StringBuffer sb4 = new StringBuffer("Biradar");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        System.out.println(sb3 == sb4);
        System.out.println(sb3.equals(sb4));

    }
}