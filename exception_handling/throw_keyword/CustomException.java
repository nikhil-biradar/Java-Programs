package exception_handling.throw_keyword;

public class CustomException extends Exception {

    CustomException(String str){
        super (str);
    }

    public static void main(String[] args) {

        try{
            CustomException obj = new CustomException("Creating Custom Exception");
            throw obj;

        } catch (CustomException ce){
            System.out.println("Custom Exception Occured");
            System.out.println(ce.getMessage());
        }
    }
}