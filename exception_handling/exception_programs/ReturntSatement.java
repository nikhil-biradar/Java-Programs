package exception_handling.exception_programs;

public class ReturntSatement {
    int m1() {
        try {
            System.out.println("I am in try block");
            int x = 20/0;
            System.out.println("Result: " +x);
            return 20;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("I am in catch block");
            return 30;
        }
        finally {
            return 100;
        }
    }
    public static void main(String[] args)
    {
        ReturntSatement ft = new ReturntSatement();
        System.out.println(ft.m1());
    }
}