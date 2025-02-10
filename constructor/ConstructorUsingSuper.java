package constructor;

class A{
    A(){
        System.out.println("Line no 5");
    }
}

class B extends A{
    B(){
        System.out.println("Line no 11");
    }

    B(int a){
        System.out.println("Line no 15");
    }
}

public class ConstructorUsingSuper extends B{
    ConstructorUsingSuper(int a){
        super(18);
//        System.out.println("Class Constructor Chaining");
    }

    public static void main(String[] args) {
        ConstructorUsingSuper obj = new ConstructorUsingSuper(10);

    }
}
