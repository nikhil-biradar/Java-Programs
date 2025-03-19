// Write a program to find out squares and cubes from 1- 10 numbers?

package lab_exercise.labEx2;

public class Q14 {
    public static void main(String[] args) {
        System.out.println("Squares of a numbers from 1 to 10 : ");
        for(int i=1; i<=10; i++){
            System.out.print((i * i) + " ");
        }
        System.out.println();
        System.out.println("Cubes of numbers from 1 to 10 : ");
        for(int i=1; i<=10; i++){
            System.out.print((i * i * i ) + " ");
        }
    }
}