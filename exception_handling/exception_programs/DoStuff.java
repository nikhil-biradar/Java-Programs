package exception_handling;

public class DoStuff {
    public static void main(String[] args) {
        doStuff();
    }
    public static void doStuff(){
        doMoreStuff();
        System.out.println(10/0);
    }
    public static void doMoreStuff(){
        doStuff();
        System.out.println("Hello");
    }
}
