package practice_programs.string;

import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String s1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter a String s2 : ");
        String s2 = sc.nextLine();

        //1st way by Using Third Variable
//        String temp = s1;
//        s1 = s2;
//        s2 = temp;

//        System.out.println("s1 : " + s1 + "\n" + "s2 : " + s2);


        //2ns way without third variable

        s1 += s2;
        s2 = s1.substring(0, (s1.length() - s2.length()));
        s1 = s1.substring(s2.length());

        System.out.println("s1 : " + s1 + "\n" + "s2 : " + s2);

    }
}
