package interview_questions.methodoverriding;

// What will be the output of the following program?

public class Q4 {
    synchronized void m1() {
        System.out.println("m1-A");
    }

    void m2(char c) {
        System.out.println("m2-A");
    }
}

class D extends Q4 {
    @Override
    public final void m1() {
        System.out.println("m1-B");
    }
    @Override
    synchronized void m2(char c) {
        System.out.println("m2-B");
    }
    public static void main(String[] args) {
        Q4 a = new D();
        a.m1();
        a.m2('a');
    }
}