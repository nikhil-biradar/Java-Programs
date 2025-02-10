package constructor;

class Parents {

    Parents(){
        System.out.println("This is Parent Constructor...");
    }
}

public class ConstructorChild extends Parents{

    ConstructorChild(){
        System.out.println("This is Child Constructor...");
    }

    ConstructorChild(String name){
        System.out.println("This is Parameterized Constructor...");
    }

    public static void main(String[] args) {
        ConstructorChild child = new ConstructorChild("Java");
    }
}