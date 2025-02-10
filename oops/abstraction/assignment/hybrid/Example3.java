package oops.abstraction.assignment.hybrid;

//Example 3
abstract class Parent {
    abstract void colour();
}

class Child1 extends Parent {
    @Override
    void colour (){
        System.out.println("White");
    }
}

class Child2 extends Parent {
    @Override
    void colour() {
        System.out.println("Whitish");
    }
}

class Child3 extends Child2 {
    public void age(){
        System.out.println("15");
    }
}

//Driver Class
public class Example3 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.colour();

        Child2 c2 = new Child2();
        c2.colour();

        Child3 c3 = new Child3();
        c3.age();
        c3.colour();
    }
}