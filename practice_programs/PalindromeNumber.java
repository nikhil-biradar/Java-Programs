package practice_programs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while(temp != 0){
            rev = (temp % 10) + (rev * 10);
            temp /= 10;
        }

        System.out.println("reverse Number : " + rev);

        if(rev == num){
            System.out.println("Number is Palindrome...");
        }else{
            System.out.println("Number is not Palindrome...");
        }


        //2nd way by using charAt(i) method

        System.out.println("Enter a Number : ");
        String str = sc.nextLine();
        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
