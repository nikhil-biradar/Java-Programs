package methods;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void walk(){
        System.out.println(name + " " + "is walking");
    }

    void eat(){
        System.out.println(name + " " + "is eating");
    }

    void walk(int step){
        System.out.println(name + " " + "is waking " + step + " steps");
    }

    void salary(double salary){
        System.out.println(name + " " + "has salary " + salary);
    }

    public static void main(String[] args) {
        Person p = new Person("Nikhil", 23);
        p.walk();
        p.eat();
        p.walk(1000);
        p.salary(100000.00);
    }
}