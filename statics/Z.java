package statics;

class Y {
    static void m1(){
        System.out.println("This is Static Method");
        Z z = new Z();
        z.m2();
    }
}

public class Z {
    void m2(){
        System.out.println("This is Instance Method");
//        m1();
    }

    public static void main(String[] args) {
        Z z = new Z();
//        z.m2();
        Y.m1();
    }
}
