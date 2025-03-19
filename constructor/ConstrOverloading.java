package constructor;

class School {
    public School(){
        System.out.println("This is Non-Parameterized Constructor");
    }

    public School(int students){
        System.out.println("Number of Students : " + students);
    }

    public School(int students, String div){
        System.out.println("Students : " + students + " Div : " + div);
    }

    public School(int students, String div, int batch){
        System.out.println("Students : " + students + " Div : " + div + " Batch : " + batch);
    }
}

public class ConstrOverloading {
    public static void main(String[] args) {
        School s = new School();
        School s1 = new School(30);
        School s2 = new School(35, "A");
        School s3 = new School(50, "B", 2024);
    }
}


//Other Examples

//Constructor OverLoading
/*
//Default Constructor
public class Employee {

    int id;
    String name;
    float salary;

    Employee(){
        id = 234;
        name = "Suraj";
        salary = 20000.0f;
        System.out.println(id + "\n" + name + "\n" + salary);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
    }
}
*/

/*
// Non-Parameterized Constructor
public class Employee{
    String name;
    int id;
    double salary;

    public Employee(){
        String name="Nikhil";
        int id=23;
        double salary=100000.00;
        System.out.println(name + "\n" +  id + "\n" + salary);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
    }
}
*/

/*
// Parameterized Constructor
public class Employee {
    Employee(){
        System.out.println("Zero Arg Const");
    }

    Employee(int age){
        System.out.println("One are Const : " + age);
    }

    Employee(int age, String name){
        System.out.println("Two arg Const : " + age + " " + name);
    }

    Employee(int age, String name, float salary){
        System.out.println("Three arg Const : " + age + " " + name + " " + salary);
    }


    public static void main(String[] args) {
        Employee e = new Employee();
        Employee e1 = new Employee(25);
        Employee e2 = new Employee(24, "Nikhil");
        Employee e3 = new Employee(26, "Nitin", 23564.25f);

    }
}
*/