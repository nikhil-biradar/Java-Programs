// Write program to print if a given number is positive or negative.

package lab_exercise.labEx2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();

        if(a >= 0){
            System.out.println(a + " is Postitive");
        }else{
            System.out.println(a + " is Negative");
        }
    }
}
