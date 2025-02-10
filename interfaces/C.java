package interfaces;

interface InterfaceA{
     default void show(){ // Since Java 8 we can add default methods in interface
         System.out.println("Interface interfaces.A");
    }
}

interface InterfaceB{
    default void show(){
        System.out.println("Interface interfaces.B");
    }
}

class C implements InterfaceA, InterfaceB {

    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
    }

    public void newShow(){
        System.out.println("Modified show method");
    }

    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.newShow();
    }
}


