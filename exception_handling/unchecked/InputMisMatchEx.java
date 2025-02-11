package exception_handling.unchecked;

import java.util.Scanner;

public class InputMisMatchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();

        //If we enter input as a string instead number then InputMismatchException occurs
        try{
            System.out.println(num1 / num2);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}
