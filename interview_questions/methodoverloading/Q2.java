package interview_questions.methodoverloading;

public class Q2
{
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
        Q2 obj = new Q2();
        obj.msg(new Object()); // Exact matched to call m1() method with Object type argument.
        obj.msg("Scientech Easy"); // Exact matched to call m1() method with String type argument.
        obj.msg(new Q2()); // Exact matched to call m1() method with Object type argument.

        obj.msg(new String());
        obj.msg(10); // Exact matched to call m1() with Integer type argument.
        obj.msg(new Integer(0));
    }
}