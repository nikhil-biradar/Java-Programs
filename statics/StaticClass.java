package statics;

public class StaticClass {

    static class A {
        {
            System.out.println("This is Instance Block Static Class A");
        }

        static{
            System.out.println("This is Static Block in Static Class A");
        }

        static void test(){
            System.out.println("This is Static Method in Static Class");
        }
    }

    public static void main(String[] args) {
        new A();
        A.test();
    }
}