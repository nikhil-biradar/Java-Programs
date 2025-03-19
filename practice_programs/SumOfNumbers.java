package practice_programs;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();
        long sum = 0;

        for(int i = num1; i <= num2; i++){
            sum += i;
        }
        System.out.println("Sum of Numbers : " + sum);
    }
}
