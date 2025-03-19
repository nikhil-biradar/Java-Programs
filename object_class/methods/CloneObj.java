package object_class.methods;

public class CloneObj implements AutoCloseable {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CloneObj(int id, String name){
        this.id = id;
        this.name = name;
    }


    public void display(){
        System.out.println("Id  : " + id + " Name : " + name);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneObj obj1 = new CloneObj(102, "Nikhil");
        CloneObj obj2 = (CloneObj) obj1.clone();
        obj2.setId(103);
        obj1.display();
        obj2.display();
    }

    @Override
    public void close() throws Exception {
    }
}