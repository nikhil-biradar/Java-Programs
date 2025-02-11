package exception_handling.exception_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter First Number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = sc.nextInt();

            int num3 = num1 / num2;
            System.out.println("Division is : " + num3);


        }catch(NullPointerException | ArrayIndexOutOfBoundsException ae){
            System.out.println("Number cannot be divided by zero !");
            System.out.println("Exception Thrown : " + ae);
        }
        catch(ArithmeticException ae){
            System.out.println("Number cannot be divided by zero !");
            System.out.println("Exception Thrown : " + ae);
        }
        catch(InputMismatchException ime){
            System.out.println("Invalid Data Types are entered !");
            System.out.println("Exception Thrown : " + ime);
        }
        System.out.println("End of Program");
    }
}
