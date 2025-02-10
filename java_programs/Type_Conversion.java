package java_programs;

public class Type_Conversion {

    public static void main(String[] args) {
        //widening Casting
        byte b = 100;
        short s = 30;
         s = b;

        //Narrowing Casting
        int i = 123123;
        short b1 = 33;
        b1 = (byte) i;
        System.out.println(b1);
    }
}