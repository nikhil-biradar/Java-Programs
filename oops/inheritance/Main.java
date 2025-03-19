package oops.inheritance;

class Employee {
    int salary = 60000;
}

class Engineer extends Employee {
    int beniftis = 10000;
}

public class Main {
    public static void main(String[] args) {
        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary + "\nBenifits : " + E1.beniftis);
    }
}
