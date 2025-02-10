package statics;


public class Indian{

    String name;
    int age;
    float Salary;
    String city;

    static String citizenship;// Here Citizenship for everyone is common thats why we made it static

    public static void main(String[] args) {
        Indian nikhil = new Indian();
        nikhil.age=23;
        citizenship = "India";


        Indian nitin = new Indian();
        nitin.age=25;
        citizenship = "India";

        System.out.println(nikhil.age + " " + citizenship);
        System.out.println(nitin.age + " " + citizenship);
    }
}