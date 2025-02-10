package statics;

public class StaticMethod {

    int b = 30;

    static int a = 10;

    static void method1(){
        a = 20;
        System.out.println(a);
    }


    public static void main(String[] args) {
        StaticMethod.method1();
    }
}