package oops.abstraction;

abstract class Test {
    abstract void test1();

    abstract void test2();
}

abstract class Test2 extends Test {

    @Override
    void test1() {

    }

    abstract void test3();
}

//Driver class
public class Main extends Test2 {
    public static void main(String[] args) {

    }

    @Override
    void test3() {

    }

    @Override
    void test2() {

    }
}