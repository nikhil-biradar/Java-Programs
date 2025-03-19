package oops.polymorphism;


//Example - 1
//public class MethodOverriding {
//
//    public void m1(){
//        System.out.println("A - m1");
//    }
//}
//
//class B extends MethodOverriding {
//
//    @Override
//    public void m1() {
//        super.m1();
//        System.out.println("B - m1");
//    }
//
//    public static void main(String[] args) {
//        B obj = new B();
//        obj.m1();
//    }
//}

////Example - 2
//class Marry {
//    void engangementdate(){
//        System.out.println("Enganement will be on Dec 23");
//    }
//
//    void marry(){
//        System.out.println("Marry will be on Dec 25");
//    }
//}
//
//
//public class MethodOverriding extends Marry {
//    @Override
//    void marry() {
//        System.out.println("Marry will be on Dec 27");
//    }
//
//    public static void main(String[] args) {
//        MethodOverriding obj = new MethodOverriding();
//        obj.engangementdate();
//        obj.marry();
//    }
//}

//Example - 3
class A {
    int x = 10;
    protected int add(int a, int b){
        int c = a + b;
        System.out.println(c);
        return c;
    }


    //Static methods can not be overridden by subclasses
    public static void show(){
        System.out.println("This is Static Method");
    }
}

class MethhodOverriding extends A {

//    x = 20; // An instance variable can never be overridden in Java.

    @Override
    public int add(int a, int b) {
        int e = a + b;
        System.out.println(e);
        return e;
    }


    public static void main(String[] args) {
        MethhodOverriding obj = new MethhodOverriding();
        obj.add(20, 30);
    }
}