package exception_handling.exception_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter First Number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = sc.nextInt();

            int num3 = num1 / num2;
            System.out.println(num3);

        }catch(InputMismatchException ime){
            System.out.println("Invalid Data Types are entered !");
            System.out.println("Exception Thrown : " + ime);
        }
    }
}
