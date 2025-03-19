package interview_questions.methodoverriding;

//What will be the output of the following program?

public class Q9 {
    void m1(Number n) {
        System.out.println("m1-P");
    }
}

class W extends Q9 {
    void m1(double d) {
        System.out.println("m2-Q");
    }

    public static void main(String[] args) {
        W q = new W();
        q.m1(1);
        q.m1(null);
    }
}