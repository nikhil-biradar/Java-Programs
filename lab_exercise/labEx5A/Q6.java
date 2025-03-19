package lab_exercise.labEx5A;

public class Q6 {
    static void m1()
    {
        System.out.println("Super m1");
    }
    void m2()
    {
        System.out.println("Super m2");
    }
}

class TestQ6 extends Q6 {
    public static void m1()
    {
        System.out.println(" from subclass m1");
    }
    public static void main(String[] args)
    {
        TestQ6 test6 = new TestQ6();
        test6.m1();
        test6.m2();

        Q6 test16 = new TestQ6(); //Super class reference variable = subclass object

        test6.m1();
        test6.m2();
    }
}
