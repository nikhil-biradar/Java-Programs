package constructor;


class Parent {
    Parent(){
        this(25);
        System.out.println("This is Parent class no-arg Constructor");
    }

    Parent(int age){
        this(58, "John");
        System.out.println("This is Parent class  1 arg Constructor");
    }

    Parent(int age, String name){
        System.out.println("This is Parent class 2 arg Constructor");
    }
}

class Child1 extends Parent {
    Child1(){
        this(25);
        System.out.println("This is Child class no-arg Constructor");
    }

    Child1(int age){
        this(20, "Nikhil");
        System.out.println("This is Child class 1 arg arg Constructor");
    }

    Child1(int age, String name){
        System.out.println("This is Child class 2 arg arg Constructor");
    }
}

public class ThisSuperEx extends Child1 {
    public static void main(String[] args) {
        ThisSuperEx t = new ThisSuperEx();
    }
}


