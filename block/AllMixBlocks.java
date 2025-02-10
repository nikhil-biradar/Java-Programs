package block;

public class AllMixBlocks {

    {
        System.out.println("Instance block - 1");
    }

    static {
        System.out.println("Static Block - 1");
    }

    {
        System.out.println("Instance Block - 2");
    }

    static {
        System.out.println("Static Block - 2");
    }

    public void display(){
        System.out.println("Local Block");
    }

    public static void main(String[] args) {
        AllMixBlocks obj = new AllMixBlocks();
        obj.display();
    }
}
