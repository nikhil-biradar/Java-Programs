package arrays;

import java.util.Scanner;

//Print sum of integer array
public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num[] = new int[5]; //Creating an array with 5 size

        System.out.println("Enter " + num.length + " Numbers : ");
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Entered Numbers are : ");
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
            sum += num[i];
        }
        System.out.println();
        System.out.println("Sum is : " + sum);
    }
}