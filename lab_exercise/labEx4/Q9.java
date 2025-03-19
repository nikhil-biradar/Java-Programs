package lab_exercise.labEx4;

public class Q9 {
    int id;
    String name;

    public void show(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println(id + " " + name);
        details(25);
    }

    public static void details(int rollNo){
//        this.rollNO = rollNo;
        System.out.println("Here this cannot be referenced from static context");
    }

    public static void main(String[] args) {
        Q9 obj = new Q9();
        obj.show(20, "Nikhil");
    }
}
