package lab_exercise.labEx5A;

public class Q5 {
    private void m1() {
        System.out.println("Test5 m1");
    }

    void m2() {
        System.out.println("Test5 m2");
        m1();
    }
}

class TestQ5 {
    void m1() {
        System.out.println("Subtest m1");
    }

    public static void main(String[] args) {


        TestQ5 s = new TestQ5();
        s.m1();
//        s.m2();

        Q5 t = new Q5();
//        t.m1();
        t.m2();
    }
}