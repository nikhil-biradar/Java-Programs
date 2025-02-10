package interview_questions.methodoverloading;

public class Q8 {

    public void test(int i) {
        System.out.println("Int");
    }
    public void test(int... i) {
        System.out.println("Int");
    }
    public void test(char... c) {
        System.out.println("Char varargs");
    }
    public static void main(String[] args)
    {
        Q8 obj = new Q8();
        obj.test('a');
        obj.test(10); // Exact matched.
    }
}