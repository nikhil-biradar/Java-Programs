package exception_handling.unchecked;

public class StringIndexOutOfBoundsEx {
    public static void main(String[] args) {

        String s = "Nikhil";

        //Exception Occurs
//        System.out.println(s.charAt(9));

        //Exception Handled
        try{
            System.out.println(s.charAt(9));
        }catch(StringIndexOutOfBoundsException se){
            System.out.println("Entered index is not found");
        }
    }
}
