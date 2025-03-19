package oops.abstraction.assignment.multilevel;

//Example 4
abstract class Tata {
    abstract void tata();

    public void brand(){
        System.out.println("This is TATA");
    }
}

abstract class Car extends Tata {
    abstract void car();

    public void carName(){
        System.out.println("This is tata's car");
    }

}

class Nexon extends Car {


    @Override
    void car() {

    }

    @Override
    void tata() {

    }

    public void nexon(){
        System.out.println("This is Nexon");
    }
}

//Driver Class
public class Example4 {
    public static void main(String[] args) {
        Nexon n4 = new Nexon();
        n4.brand();
        n4.carName();
        n4.nexon();
    }
}
