package practice_programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while(temp != 0){
            rev = temp % 10 + rev * 10;
            temp /= 10;
        }

        System.out.println("Reversse Number : " + rev);
    }
}
