package string.string_methods;

public class SplitMethod {
    public static void main(String[] args) {

        //Case 1
        String str = "I Love Java Technology";

        String arr [] = str.split(" ");

        //By using for loop
        System.out.println("Using For Loop : ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //By using each loop
        System.out.println("\nUsing For Each Loop : ");
        for(String s : arr){
            System.out.println(s);
        }

        //Case 2
        String str1 = new String("I.Love.Java.Technology");

        String arr1 [] = str1.split("\\.");

        System.out.println("\nOutput for regex . : ");
        for(String s1 : arr1){
            System.out.println(s1);
        }
    }
}