package exception_handling.throws_keyword;

public class InterruptedEx {
    public static void main (String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Hello Java");
    }
}
