package interview_questions.methodoverriding;

// In the below snippet code, Is m1() correctly overridden in the subclasses of class X?

public class Q13 {
    void m1() {

    }
}

class Two extends Q13 {
    @Override
    protected void m1() {
        System.out.println("m1-Two");
    }
}

class Three extends Two {
    @Override
    public void m1() {
        System.out.println("m1-Three");
    }
}