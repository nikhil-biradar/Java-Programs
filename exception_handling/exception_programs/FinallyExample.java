package exception_handling;

public class FinallyExample {
    public static void main(String[] args) {
        try
        {
            System.out.println("111");
            System.out.println(20/0);
            System.out.println("222");
        }
        catch(Exception ae)
        {
            System.out.println(10/0);
        }
        finally
        {
            System.out.println("444");
        }
        System.out.println("555");
    }
}
