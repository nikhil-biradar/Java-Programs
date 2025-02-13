package exception_handling.custom_exception;
import java.util.Scanner;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

class CheckAge {
    private static int age;

    static void validate() throws InvalidAgeException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();

        if(age < 18){
            throw new InvalidAgeException("Invalid Age ! You are not eligible to vote");
        }else{
            System.out.println("Welcome to vote !");
        }
    }

    public static void main(String[] args) {
        try{
            CheckAge.validate();

        } catch (InvalidAgeException e) {
            System.out.println("Exception Occurs : \n" + e);
        }
    }
}