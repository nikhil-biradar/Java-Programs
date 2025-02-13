package exception_handling.throw_keyword;

public class ArithmeticEx {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
//            throw new ArithmeticException();

        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }
}
