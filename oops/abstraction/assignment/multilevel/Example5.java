package oops.abstraction.assignment.multilevel;

//Example 5
abstract class Person1 {
    abstract void person1();
}

abstract class Person2 extends Person1 {
    abstract void person2();

    public void person2nam(){
        System.out.println("This is non-abstract method of class Person2");
    }
}

class Person3 extends Person2 {

    @Override
    void person2() {

    }

    @Override
    void person1() {
        System.out.println("This is abstract method of class Person1");
    }
}

//Driver Class
public class Example5 {
    public static void main(String[] args) {
        Person3 p5 = new Person3();
        p5.person2nam();
        p5.person1();
    }
}
