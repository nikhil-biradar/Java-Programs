package oops.inheritance.single;

class One {
    public void display_name(){
        System.out.println("Nikhil");
    }
}

class Two extends One {
    public void display_surname(){
        System.out.println("Biradar");
    }
}

//Driver class
public class Main {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.display_name();
        obj.display_surname();
    }
}
