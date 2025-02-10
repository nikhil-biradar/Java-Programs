package oops.polymorphism;

class Person {
    void role(){
        System.out.println("I am a Peson");
    }
}

public class Father extends Person {
    @Override
    void role() {
        System.out.println("I am a Father");
    }

    public static void main(String[] args) {
        new Father().role();
    }
}
