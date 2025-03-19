package arrays;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rem = 0, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        while (num != 0) {
            rem = num % 10;
            num = num / 10;
        }
        System.out.println("The Number after Reversing : " + rem);
    }
}