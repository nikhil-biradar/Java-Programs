package flowcontrol;

import java.util.Scanner;

public class IfElseIfLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();


//        int size = 40;

        if(size == 38){
            System.out.println("Your T-Shirt size is S");
        }
        else if(size == 40){
            System.out.println("Your T-Shirt size is M");
        }
        else if(size == 42){
            System.out.println("Your T-Shirt size is L");
        }
        else if(size == 44){
            System.out.println("Your T-Shirt size is XL");
        }
        else if(size == 46){
            System.out.println("Your T-Shirt size is XXL");
        }else{
            System.out.println("Please enter correct size");
        }
    }
}
