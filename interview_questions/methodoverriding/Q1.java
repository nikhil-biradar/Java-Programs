package interview_questions.methodoverriding;

//Is the below code successfully overridden?

public class Q1 {
    private void m1() {
        System.out.println("m1-A");
    }
}
class B extends Q1 {
//    @Override
    private void m1() {
        System.out.println("m1-B");
    }
    public static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}