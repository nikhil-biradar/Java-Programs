package constructor;

class ParentThis{
    ParentThis(){
        System.out.println("Class ParentThis's no-arg Constructor");
    }
}

public class This extends ParentThis {
    This(){
        this(20, "Java");
        System.out.println("Class This's no-arg Constructor");
    }

    This(int age){
        super();
        System.out.println("Class This's 1 Param Constructor");
    }

    This(int age, String name){
        this(23);
        System.out.println("Class This's 2 Param Constructor");
    }

    public static void main(String[] args) {
        This t = new This();
    }
}
