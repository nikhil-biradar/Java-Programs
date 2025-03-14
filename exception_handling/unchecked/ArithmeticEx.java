package exception_handling.unchecked;

//Exception Occurs if divide by 0
public class ArithmeticEx {
    public static void main(String[] args) {

        //Exception Occurs
        System.out.println("One");
        System.out.println("Two");
//        System.out.println(10/0); //Exception Occurs at this line


        //Exception Handled
        try{
            System.out.println(10/0);
        } catch (Throwable ae) {
            System.out.println("Number cannot be divided by zero");
        }

        System.out.println("Three");
        System.out.println("Four");
    }
}