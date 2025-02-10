// Write java program to check odd or even using modulus operator

package lab_exercise.labEx2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println(a + " is Even Number");
        }else{
            System.out.println(a + " is Odd Numebr");
        }
    }
}
