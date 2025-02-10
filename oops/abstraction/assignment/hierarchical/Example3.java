package oops.abstraction.assignment.hierarchical;

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

//Driver Class
public class Example3 {
    public static void main(String[] args) {
        Child1 c3 = new Child1();
        c3.colour();

        Child2 c2 = new Child2();
        c2.colour();
    }
}