package block;

public class ParentChild {
    static {
        System.out.println("Static Block Parent");
    }

    {
        System.out.println("Instance Block Parent");
    }

    ParentChild(){
        System.out.println("Constructor Parent");
    }
}

class Child extends ParentChild {
    static {
        System.out.println("Static Block Child");
    }

    {
        System.out.println("Instance Block Child");
    }

    Child(){
        System.out.println("Constructor Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}
