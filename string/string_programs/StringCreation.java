package string;

public class StringCreation {
    public static void main(String[] args) {

        //There are Three ways to create a String.


        //1st way by using String Literal
        String s1 = "Nikhil";
        System.out.println(s1);

        //2nd way by using new Keyword
        String s2 = "Nikhil";
        System.out.println(s2);

        //3rd way by using Character Array
        char arr [] = {'N', 'i', 'k', 'h', 'i', 'l'};
        String s3 = new String(arr);
        System.out.println(s3);

    }
}
