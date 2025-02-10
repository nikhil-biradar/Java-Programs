// Write program to print the even numbers between two numbers order may be increment or decrement?

package lab_exercise.labEx2;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

        if(a < b){
            for(int i=a; i<=b; i++){
                if(i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
        }

        else if(a > b){
            for(int i=a; i>=b; i--){
                if(i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
        }

        else{
            System.out.println("Both Numbers are Same");
        }
    }
}
