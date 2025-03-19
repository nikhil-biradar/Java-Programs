package constructor;

public class Constructor {

    public Constructor(){
        System.out.println("This is public accessmodifiers.constructor");
    }

    private Constructor(int age){
        System.out.println(age);
    }

    protected Constructor(String name){
        System.out.println(name);
    }

    public void dummy(){
        System.out.println("This is dummy method");
    }


    public static void main(String[] args) {
        Constructor obj = new Constructor();

        Constructor obj1 = new Constructor(23);

        Constructor obj2 = new Constructor("Java");
    }
}
