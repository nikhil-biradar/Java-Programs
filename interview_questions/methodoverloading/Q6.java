package interview_questions.methodoverloading;

public class Q6 {

    public static void test(int[] intArr) {
        System.out.println("int array");
    }
    public static void test(char[] charArr) {
        System.out.println("char array");
    }
    public static void main(String[] args)
    {
//        test(null);  //Ambiguity
    }
}