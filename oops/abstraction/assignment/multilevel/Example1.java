package oops.abstraction.assignment.multilevel;

//Example 1
abstract class Animal {
    public abstract void sleep();

    public void drink(){
        System.out.println("Animal drinks water");
    }
}

abstract class Cow extends Animal {
    public abstract void run();

    public void eat(){
        System.out.println("Cow eat Grass");
    }

}

class Calf extends Cow {

    @Override
    public void run() {
        System.out.println("Cat run");
    }

    @Override
    public void sleep() {

    }
}

//Driver Class
public class Example1 {
    public static void main(String[] args) {
        Calf c1 = new Calf();
        c1.drink();
        c1.eat();
    }
}

