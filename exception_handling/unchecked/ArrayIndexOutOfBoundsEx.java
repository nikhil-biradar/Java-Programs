package exception_handling.unchecked;

public class ArrayIndexOutOfBoundsEx {
    public static void main(String[] args) {

        //Exception Occured
//        int [] arr = {1, 2, 3, 4, 5};
//        System.out.println(arr[5]);

        //Exception Handled
        try{
            int [] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Specified index does not found. Please enter correct index");
        }
    }
}