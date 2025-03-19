package oops.inheritance.multiple;

interface One {
    void display_name();
}

interface Two {
    void display_fathers_name();
}


class Child implements One, Two {
    @Override
    public void display_name(){
        System.out.println("Nikhil");
    }

    public void display_fathers_name(){
        System.out.println("Balaji");
    }

    public void display_surname(){
        System.out.println("Biradar");
    }
}

//Driver class
public class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display_name();
        c1.display_fathers_name();
        c1.display_surname();
    }
}
