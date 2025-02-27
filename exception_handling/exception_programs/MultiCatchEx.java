package exception_handling.exception_programs;

public class MultiCatchEx {
    public static void main(String[] args) {
        int a [] = {10, 20, 30};

        try{
            int c = a[3]/0;

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}