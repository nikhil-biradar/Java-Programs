package oops.encapsulation;

public class EmployeeDetails {

    private String name;
    private int age;
    private String address;
    private long aadharNo;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(int aadharNo) {
        this.aadharNo = aadharNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        EmployeeDetails obj = new EmployeeDetails();
        obj.name = "Nikhil Biradar";
        obj.age = 23;
        obj.address = "Udgir";
        obj.salary = 100000.00;
        obj.aadharNo = 884967597652L;

        System.out.println("Name : " + obj.name);
        System.out.println("Age : " + obj.age);
        System.out.println("Address : " + obj.address);
        System.out.println("Aadhar_No : " + obj.aadharNo);
        System.out.println("Salary : " + obj.salary);
    }
}