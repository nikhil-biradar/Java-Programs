package interview_questions.methodoverriding;

// What will be the output of the following program?

class Animal {
    void m1(Animal a) {
        System.out.println("Both dogs and cats are pets.");
    }
}

class Dog extends Animal {
    @Override
    protected void m1(Animal a) {
        System.out.println("The only dog is a pet animal.");
    }
}

class Cat extends Dog {
    @Override
    public void m1(Animal a) {
        System.out.println("Cat is also a pet animal.");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.m1(null);
        Dog d = new Dog();
        d.m1(a);
        Cat c = (Cat)new Animal();
        c.m1(null);
    }
}