package constructor;

public class ConstructorTypes {
    int a;
    String s;
    boolean b;

    ConstructorTypes(){
        System.out.println("This is no-arg / non-parameterized Constructor...");
    }

    ConstructorTypes(int num, String name, Boolean condn){
        this.a=num;
        this.s=name;
        this.b=condn;
    }

    public static void main(String[] args) {
        ConstructorTypes obj = new ConstructorTypes();
        System.out.println(obj.a);
        System.out.println(obj.s);
        System.out.println(obj.b);

        System.out.println();
        ConstructorTypes obj1 = new ConstructorTypes(100, "Nikhil", true);
        System.out.println(obj1.a);
        System.out.println(obj1.s);
        System.out.println(obj1.b);
    }
}
