package oops.abstraction.assignment.multilevel;

//Example 3
abstract class GrandParent {
    abstract void gpabstractmethod();

    public void gpnabstractmethod(){
        System.out.println("GP non-abstract method");
    }

}

abstract class Parent extends GrandParent {
    abstract void pabstractmethod();

    public void pnabstractmethod(){
        System.out.println("P non-abstract method");
    }
}

abstract class Child1 extends Parent {
    abstract void c1abstractmethod();

    public void c1nabstractmethod(){
        System.out.println("C1 non-abstract method");
    }
}

abstract class Child2 extends Parent {
    abstract void c2abstractmethod();
}

class GrandChild extends Child1 {
    public void gcnabstractmethod(){
        System.out.println("GC non-abstract method");
    }

    @Override
    void c1abstractmethod() {

    }

    @Override
    void pabstractmethod() {

    }

    @Override
    void gpabstractmethod() {

    }
}

//Driver Class
public class Example3 {
    public static void main(String[] args) {
        GrandChild g3 = new GrandChild();
        g3.gpnabstractmethod();
        g3.pnabstractmethod();
        g3.c1nabstractmethod();
        g3.gcnabstractmethod();
    }
}
