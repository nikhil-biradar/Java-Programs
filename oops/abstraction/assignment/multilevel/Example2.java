package oops.abstraction.assignment.multilevel;

//Example 2
abstract class A {
    abstract void print1();

    public void printA(){
        System.out.println("Class A");
    }
}

abstract  class B extends A {
    abstract void print2();

    public void printB(){
        System.out.println("Class B");
    }
}

class C extends B {

    @Override
    void print1() {

    }

    @Override
    void print2() {

    }

}

//Driver Class
public class Example2 {
    public static void main(String[] args) {
        C c2 = new C();
        c2.printA();
        c2.printB();
    }
}