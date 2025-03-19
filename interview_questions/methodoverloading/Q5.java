package interview_questions.methodoverloading;

public class Q5 {

    public static void msg(long a, int b) {
        System.out.println("Hello");
    }
    public static void msg(int a, long b) {
        System.out.println("Hi");
    }
    public static void main(String[] args)
    {
        msg(5l, 10);
//        msg(10,11); // Ambigious
    }
}