package interview_questions.methodoverloading;

public class Q7 {

    public void test(int i) {
        System.out.println("int");
    }
    public void test(Number n) {
        System.out.println("Number");
    }
    public void test(Integer i) {
        System.out.println("Integer");
    }
    public static void main(String[] args)
    {
        Q7 o = new Q7();
        o.test(null);
        o.test(10); // Exact matched.
    }
}