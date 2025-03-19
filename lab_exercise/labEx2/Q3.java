//Write Program to read 2 numbers and print biggest number ? (Using Scanner)

package lab_exercise.labEx2;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter First Number : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Biggest Number : " + a);
        }else{
            System.out.println("Biggest Number : " + b);
        }
    }
}
