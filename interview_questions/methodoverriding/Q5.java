package interview_questions.methodoverriding;

//What will be the output of the following program?

class X {
    strictfp void method(int a) {
        System.out.println("One");
    }
    strictfp void method(double b) {
        System.out.println("Two");
    }
}

class Y extends X {
    @Override
    void method(double b) {
        System.out.println("Three");
    }
}

public class Q5 {
    public static void main(String[] args) {
        new Y().method(20);
    }
}