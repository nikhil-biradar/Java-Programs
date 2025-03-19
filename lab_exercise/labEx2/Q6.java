// Write program to print given numbers are equal or not.

package lab_exercise.labEx2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter second Number : ");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Numbers are Equal");
        }else{
            System.out.println("Numbers are not Equal");
        }
    }
}
