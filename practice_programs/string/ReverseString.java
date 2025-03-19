package practice_programs.string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        //1st way by using chatAt method
        String rev = "";
        String revstr = "";
        for(int i = str.length()-1; i >= 0; i--){
             rev += str.charAt(i);
        }
        System.out.println("Reversed String : " + rev);



        //2nd Way by using Character Array
        char arr [] = str.toCharArray();
        System.out.print("Reversed String : ");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
        }


        //3rd Way by using reverse method of StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println("\nReversed String : " + sb.reverse());


        //4th way by using

    }
}