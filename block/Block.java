package block;

//Default Values

public class Block {
    static int a;
    static String s;
    static boolean b;

    public void defValue(){
        System.out.println(a);
        System.out.println(s);
        System.out.println(b);
    }

    {
        int y=30;
        System.out.println(y);  // First Block will be executed
    }
    public static void main(String[] args) {
        Block obj = new Block();
        obj.defValue();
    }
}