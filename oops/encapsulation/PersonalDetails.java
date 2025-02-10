package oops.encapsulation;

public class PersonalDetails {

    private int id = 123;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        PersonalDetails obj = new PersonalDetails();
        obj.name = "Nikhil";
        obj.getId();

        System.out.println(obj.getName()  + " " + obj.getId());
    }
}