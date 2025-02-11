package exception_handling.unchecked;

class SuperClass {
    void m1(){
        System.out.println("This is m1 method in Parent");
    }
}

class SubClass extends SuperClass {
    void m2(){
        System.out.println("This is m2 method in Child");
    }
}


public class ClassCastEx {
    public static void main(String[] args) {
        SuperClass sp = new SuperClass();
        SubClass sb = (SubClass) sp;
    }
}
