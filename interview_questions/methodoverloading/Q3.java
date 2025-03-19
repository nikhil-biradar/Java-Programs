package interview_questions.methodoverloading;

public class Q3 {
    void msg(Object obj) {
        System.out.println("Good");
    }
    void msg(String str) {
        System.out.println("Better");
    }
    void msg(Integer itr) {
        System.out.println("Best");
    }
    public static void main(String[] args)
    {
        Q3 obj = new Q3();
//        obj.msg(null); // Created an ambiguous situation for the compiler to call.
    }
}