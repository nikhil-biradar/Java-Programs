package block;

public class StaticBlock {

    {
        System.out.println("This is Instance Block");

    }

    static {
        System.out.println("This is 1st Static Block");

        {
            System.out.println("This is Instance block inside static");
        }
    }

    static {
        System.out.println("This is 2nd Static Block");
    }



    public static void main(String[] args) {
        new StaticBlock();
    }
}
