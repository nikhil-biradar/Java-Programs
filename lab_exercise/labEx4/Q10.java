package lab_exercise.labEx4;

public class Q10 {
    int id;
    String name;

    public Q10() {
        System.out.println("This is Default Constructor");
    }

    public Q10(int id, String name){
        this.id = id;
        this.name = name;

        System.out.println("This is Parameterized Constructor : " + id + " " + name);
    }

    public static void main(String[] args) {
        Q10 obj = new Q10();
        Q10 obj1 = new Q10(23, "Nikhil");
    }
}