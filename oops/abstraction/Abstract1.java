package oops.abstraction;

abstract class Abstract2 {
    abstract void abstractmethod();

    public void nonabstractmethod() {
        System.out.println("non-abstarct method");
    }
}

//Abstract Class
abstract class Abstract1 extends Abstract2 {
    public static void main(String[] args) {

        Abstract1 obj = new Abstract1() {
            @Override
            void abstractmethod() {

            }
        };

        obj.abstractmethod();
        obj.nonabstractmethod();
    }
}