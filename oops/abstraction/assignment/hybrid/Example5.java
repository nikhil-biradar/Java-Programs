package oops.abstraction.assignment.hybrid;

//Example 5
abstract class Tata {
    abstract void display();

}

class Punch extends Tata {
    @Override
    void display() {
        System.out.println("TATA PUNCH");
    }
}

class Nexon extends Tata {
    @Override
    void display() {
        System.out.println("TATA NEXON");
    }
}

class Curvv extends Nexon {
    void display(){
        System.out.println("TATA CURVV");
    }
}

//Driver Class
public class Example5 {
    public static void main(String[] args) {
        Punch p5 = new Punch();
        p5.display();

        Nexon n5 = new Nexon();
        n5.display();

        Curvv c5 = new Curvv();
        c5.display();
    }
}