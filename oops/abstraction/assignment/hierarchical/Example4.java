package oops.abstraction.assignment.hierarchical;

//Example 4
abstract class A {
    abstract void print();
}

class B extends A {
    @Override
    void print() {
        System.out.println("Class B");
    }
}

class C extends A {
    @Override
    void print() {
        System.out.println("Class C");
    }
}


//Driver Class
public class Example4 {
    public static void main(String[] args) {
        B b4 = new B();
        b4.print();

        C c = new C();
        c.print();
    }
}
