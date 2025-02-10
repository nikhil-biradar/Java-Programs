package interview_questions.methodoverriding;

// In the below example program, class Q extends class P. Which method of class Q is not properly overridden in class B?

public class Q10 {
    public Object m1() {
        return null;
    }
    void m2(Number n) {
        System.out.println("m1-P");
    }
}

class P extends Q10 {
    public StringBuffer m1() {
        return null;
    }
    void m2(double d) {
        System.out.println("m2-Q");
    }

    public static void main(String[] args) {

    }
}