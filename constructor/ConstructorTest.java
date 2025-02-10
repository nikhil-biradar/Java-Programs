package constructor;

class SuperA {
    SuperA(){
        this("Nikhil");
        System.out.println("Class SuperA no-arg Constructor");
    }

    SuperA(int a){
        this();
        System.out.println("Class SuperA 1 arg Constructor");
    }

    SuperA(String s){
        System.out.println("Class SuperA String Param " + s);
    }
}

class SuperB extends SuperA {
    SuperB(){
        this(20, "kava");
        System.out.println("Class SuperB no-arg Constructor");
    }

    SuperB(int a, String b){
        super(10);
        System.out.println("Class SuperB 2 arg Constructor");
    }
}

public class ConstructorTest extends SuperB {
    ConstructorTest(){
        System.out.println("Class ConstructorTest no-arg Constructor");
    }

    ConstructorTest(int a, String b, boolean c){
        this();
        System.out.println("Class ConstructorTest 3 arg Constructor");
    }

    public static void main(String[] args) {
        ConstructorTest c = new ConstructorTest(20, "nikhil", true);
    }
}
