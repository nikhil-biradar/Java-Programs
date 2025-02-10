package statics;

public class StaticTest {

    static private int a = 10;

    static void test(){
        int a = 20;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 30;
        StaticTest.test();
        System.out.println(a);
    }
}