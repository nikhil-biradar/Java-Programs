package oops.abstraction.assignment.hybrid;

//Example 1
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meos");
    }
}

class Mouse extends Cat {
    public void colour(){
        System.out.println("Black");
    }
}

//Driver class
public class Example1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();

        Mouse m1 = new Mouse();
        m1.colour();
    }
}
