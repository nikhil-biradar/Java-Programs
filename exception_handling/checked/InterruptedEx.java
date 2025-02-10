package exception_handling.checked;

public class InterruptedEx {
    public static void main(String[] args) {

        //Exception Occurs
        System.out.println("Java Technology");
//        Thread.sleep(1000);

        //Exception Handled
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
