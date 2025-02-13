package exception_handling.exception_programs;

public class TryCatchMix {
    public static void main(String[] args) {

        try
        {
            System.out.println(10/0);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println(aie.getMessage());
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }

        try
        {
            System.out.println(10/2);
        }
        catch (ArithmeticException ae) {
            System.out.println("Number cannot divide by zero");
        }
    }
}