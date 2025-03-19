package oops.abstraction.assignment.hybrid;

//Example 2
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

class Square extends Rectangle {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

//Driver Class
public class Example2 {
    public static void main(String[] args) {
        Circle c2 = new Circle();
        c2.draw();

        Rectangle r2 = new Rectangle();
        r2.draw();

        Triangle t2 = new Triangle();
        t2.draw();

        Square s2 = new Square();
        s2.draw();
    }
}


