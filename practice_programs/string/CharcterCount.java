package practice_programs.string;

import java.util.Scanner;

public class CharcterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s1 = sc.nextLine();

        //1st way by using charAt method
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != ' ')
            count ++;
        }
        System.out.println(count);


        //2nd way by using replace method
        s1 = s1.replace(" ", "");
        System.out.println(s1.length());
    }
}