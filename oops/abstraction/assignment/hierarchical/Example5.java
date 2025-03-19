package oops.abstraction.assignment.hierarchical;

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
//Driver Class
public class Example5 {
    public static void main(String[] args) {
        Punch p5 = new Punch();
        p5.display();

        Nexon n5 = new Nexon();
        n5.display();
    }
}
