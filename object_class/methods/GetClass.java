package object_class.methods;

public class GetClass {
    int x ;

    public GetClass(int x){
        this.x = x;
    }

    public static void main(String[] args) {

        GetClass obj = new GetClass(10);

        Class c = obj.getClass();
        String name = c.getName();
        System.out.println(name);
    }
}
