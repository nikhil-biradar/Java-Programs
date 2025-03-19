package practice_programs;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        int temp = 0;

        // Solution 1 with using third variable

        /*
        temp = a;
        a = b;
        b = temp;

        System.out.println("First Number : " + a);
        System.out.println("Second Number : " + b);
        */

        // Solution 2 without using third variable

        /*
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("First Number : " + a);
        System.out.println("Second Number : " + b);
        */

        //Solution 3 without using third variable

        /*
        a = a * b;
        b = a / b;
        a = a / b;
         */

        /*

        //Solution 4 without using third variable

        System.out.println("First Number : " + a);
        System.out.println("Second Number : " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("First Number : " + a);
        System.out.println("Second Number : " + b);
        */

        //Solution 5 using single statement

        a = a + b - (b = a);

        System.out.println("First Number : " + a);
        System.out.println("Second Number : " + b);
    }
}