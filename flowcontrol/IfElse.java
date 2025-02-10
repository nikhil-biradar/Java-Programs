package flowcontrol;

public class IfElse {
    public static void main(String[] args) {

        //Example 1

        int a = 200;
        int b = 100;

        if(a>b){
            System.out.println("a is greater than b ");
        }else{
            System.out.println("b is greater than a ");
        }

        //Example 2

        int age = 20;

        if(age > 18){
            System.out.println("You're ready to vote ! ");
        }else{
            System.out.println("Your age is not enough to vote ! ");
        }

        int x = 300;
        int y = 100;
        int z = 200;

        if(x>y && y>z){
            System.out.println("Condition is True");
        }else{
            System.out.println("Condition is False");
        }
        if(x>y || y>z){
            System.out.println("Condition is True");
        }else{
            System.out.println("Condition is False");
        }
    }
}