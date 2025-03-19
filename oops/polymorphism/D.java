package oops.polymorphism;

class C {
    void m1(){
        System.out.println("m1 - C");
    }

    void m2(){
        System.out.println("m2 - C");
    }
}

public class D extends C {
    @Override
    void m2() {
        System.out.println("m2 - D");
    }

    void m3(){
        System.out.println("m3 - D");
    }

    public static void main(String[] args) {
        C obj1 = new C();
        obj1.m1();
        obj1.m2();

        D obj2 = new D();
        obj2.m1();
        obj2.m2();
        obj2.m3();

        C obj3 = new D();
        obj3.m1();
        obj3.m2();
    }
}
