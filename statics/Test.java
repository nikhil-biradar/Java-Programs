package statics;

public class Test {
    int empId;

    {
        empId = 123; // Instance Block is used to assign value to variable
    }

    void display(){
        System.out.println(empId);
    }

    public static void main(String[] args) {
        new Test().display();
    }
}