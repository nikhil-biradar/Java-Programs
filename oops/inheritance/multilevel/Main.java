package oops.inheritance.multilevel;

class One {
    public void print_name(){
        System.out.println("Nikhil");
    }
}

class Two extends One {
    public void print_fathers_name() {
        System.out.println("Balaji");
    }
}

class Three extends Two {
    public void print_surname(){
        System.out.println("Biradar");
    }
}

//Driver class
public class Main {
    public static void main(String[] args) {
        Three T1 = new Three();
        T1.print_name();
        T1.print_fathers_name();
        T1.print_surname();
    }
}
