package oops.abstraction.assignment.hybrid;

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

class D extends C {
    void display(){
        System.out.println("class D");
    }
}

//Driver Class
public class Example4 {
    public static void main(String[] args) {
        B b4 = new B();
        b4.print();

        C c4 = new C();
        c4.print();

        D d4 = new D();
        d4.display();
    }
}
