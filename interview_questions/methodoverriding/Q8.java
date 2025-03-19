package interview_questions.methodoverriding;

//Can you find out the error in the below code?

public class Q8 {
    static void m1() {
        System.out.println("Class P");
    }
}

class Q extends Q8 {
//    @Override
    static void m1() {
        System.out.println("Class Q");
    }
}