package exception_handling.exception_programs;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // Throws ArrayIndexOutOfBoundsException
            int result = 10 / 0;            // This line is never reached
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }

        System.out.println("After try-catch block");
    }
}
