package constructor;

public class ConstructorUsingThis {

    ConstructorUsingThis(){
        this("Java");
        System.out.println("This is no-arg Constructor");
    }

    ConstructorUsingThis(String a){
        this("Nikhil", 25);
        System.out.println("This is String arg Constructor");
    }

    ConstructorUsingThis(int a){
        this();
        System.out.println("This is int arg Constructor");
    }

    ConstructorUsingThis(String m, int n){
        this(true);
        System.out.println("This is String and int arg Constructor");
    }

    ConstructorUsingThis(boolean a){
        System.out.println("This is boolean arg Constructor");
    }

    public static void main(String[] args) {
        ConstructorUsingThis obj = new ConstructorUsingThis(100 );
    }
}