package exception_handling.exception_programs;

public class TryCatchMix {
    public static void main(String[] args) {

        try
        {
            System.out.println(10/5);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try
        {
            System.out.println(10/2);
        } catch (RuntimeException e) {
            System.out.println("Number cannot divide by zero");
        }
    }
}