// Write program to check whether a year is leap or not ?

package lab_exercise.labEx2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year / 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a Leap Year");
        }else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}
