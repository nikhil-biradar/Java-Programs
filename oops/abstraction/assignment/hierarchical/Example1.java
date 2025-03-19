package oops.abstraction.assignment.hierarchical;

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


//Driver class
public class Example1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();

        Cat c1 = new Cat();
        c1.sound();

    }
}
