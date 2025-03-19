package block;

public class InnerOuter {

    public static void methodBlock(){
        int x = 20;
        System.out.println("Outer Block");

        {
            int y = 30;
            System.out.println("Inner Block");
        }
    }

    public static void main(String[] args) {
        InnerOuter.methodBlock();
    }
}