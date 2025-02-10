package oops.abstraction;

abstract class Animal {
     private String name;

     public Animal(String name){
         this.name = name;
     }

     public abstract void makeSound ();

     public String getName (){
         return name;
     }
}

class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Barks");
    }
}

class Cat extends Animal {

    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Mews");
    }
}

//Driver Class
public class AbstractionEx {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Mani");

        myDog.makeSound();
        myCat.makeSound();
    }
}
