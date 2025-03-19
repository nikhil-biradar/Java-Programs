package exception_handling.exception_programs;

public class TryCatchFinally {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }catch(ArithmeticException ae){
            System.out.println("Can't divide by zero");
        }finally{
            System.out.println("Finally Block will always exeute whether exception occurs or not");
        }
    }
}