package exception_handling.custom_exception;

import java.util.Scanner;

public class SquareException extends Exception {
    SquareException(String str){
        super(str);
    }
}

class FindSquare {

    private static int num;
    static void squareOfNumber() throws SquareException {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(num > 100){
            throw new SquareException("Number is Greater than 100 can't find square of a this number");
        }else{
            System.out.println("Square of " + num + " is : " + (num * num));
        }
    }

    public static void main(String[] args) {
        try{
            FindSquare.squareOfNumber();

        } catch (SquareException e) {
            System.out.println("Custom Exception Occured : \n" + e);
        }
    }
}
