package interview_questions.methodoverloading;

public class Q4 {
    public static void m1(int a) {
        System.out.println("int");
    }
    public static void m1(short a) {
        System.out.println("short");
    }
    public static void m1(Object a) {
        System.out.println("object");
    }
    public static void m1(String a) {
        System.out.println("String");
    }
    public static void main(String[] args)
    {
        byte b = 5;
        m1(b); // First call
        m1(5); // Second call Integer

         Object i = 10;
        m1(i); // Third call
        m1("10"); // Fourth call
        m1(null); // Fifth call
    }
}