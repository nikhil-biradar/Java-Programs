package interview_questions.methodoverriding;

//Will the below code compile successfully?

public class Q2 {
    public final void m1() {
        System.out.println("m1-A");
    }
}

class BB extends Q2 {
//    public void m1()
    {
        System.out.println("m1-B");
    }
    public static void main(String[] args) {
        BB b = new BB();
        b.m1();
    }
}
