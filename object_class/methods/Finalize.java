package object_class.methods;

public class Finalize {
    public static void main(String[] args) throws Throwable {

        Finalize obj = new Finalize();
        System.out.println("Finalizing...");
        obj.finalize();
        System.out.println("Finalized");
    }
}
