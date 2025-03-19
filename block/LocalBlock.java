package block;

public class LocalBlock {

    LocalBlock(){ //Constructor
        {
            System.out.println("Local Block in Constructor");
        }
    }

    public void localBlock(){ //Method
        System.out.println("This is Method");

        {
            System.out.println("Local Block in Method");
        }
    }
    public static void main(String[] args) {
        LocalBlock l = new LocalBlock();
        l.localBlock();
    }
}
