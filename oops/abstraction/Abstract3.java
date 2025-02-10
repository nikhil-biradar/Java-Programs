package oops.abstraction;

abstract class Abstract4 {
    abstract void abstractmethod();

    public void nonabstractmethod() {
        System.out.println("non-abstract method");
    }
}

//Public Class
public class Abstract3 extends Abstract4 {
    public static void main(String[] args) {

        Abstract3 obj = new Abstract3();
        obj.abstractmethod();
        obj.nonabstractmethod();
    }

    @Override
    void abstractmethod() {
        System.out.println("abstract method");
    }
}
