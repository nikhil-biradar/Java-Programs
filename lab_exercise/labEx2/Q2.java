//Write Program using if and else blocks.

package lab_exercise.labEx2;

public class Q2 {

    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        int c = 5;

        if(a>b && a>c){
            System.out.println(a + " is Greater");
        }else if(b>a && b>c){
            System.out.println(b + " is Greater");
        }else{
            System.out.println(c + " is Greater");
        }
    }
}
