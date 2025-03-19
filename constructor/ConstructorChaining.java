package constructor;

class GrandParent{
    GrandParent(){
        System.out.println("Grand Parent class Construtcor");
    }
}

class Parent1 extends GrandParent {
    Parent1(){
        System.out.println("Parent class Constructor");
    }
}

class Child extends Parent1 {
    Child(){
        System.out.println("Child Class Constructor");
    }
}
//Driver class
public class ConstructorChaining extends Child {
    public static void main(String[] args) {
        ConstructorChaining c = new ConstructorChaining();
    }
}


