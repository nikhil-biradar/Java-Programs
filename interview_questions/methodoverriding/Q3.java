package interview_questions.methodoverriding;

// Will the below code compile successfully? If yes, what will be the output?

public class Q3 {
    protected void m1() {
        System.out.println("m1-A");
    }
}
class C extends Q3
{
    public final void m1() {
        System.out.println("m1-B");
    }
    public static void main(String[] args) {
        C b = new C();
        b.m1();
        Q3 a = new C();
        a.m1();
    }
}