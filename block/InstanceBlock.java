package block;

public class InstanceBlock {

    // Order of Execution of Instance Blocks
//    {
//        System.out.println("1st Instance Block");
//    }
//
//    {
//        System.out.println("2nd Instance Block");
//    }

    // Multiple Constructors Created

    //Non-Parameterized Constructor with 0 args
    InstanceBlock(){
        System.out.println("0-arg Constructor \n");
    }

    //Parameterized Constructor with 1 args
    InstanceBlock(int a){
        System.out.println("1-arg Constructor \n");
    }

    //Parameterized Constructor with 2 args
    InstanceBlock(int a, int b){
        System.out.println("2-arg Constructor \n");
    }

    // Instance Block
    {
        System.out.println("This is Instance Block");
    }

    //Static Block
    //It Executes only once bcoz class file is loaded into memory only once
    static{
        System.out.println("This is Static Block \n");
    }

    public static void main(String[] args) {
        //For Every Constructor Object same Instance block is called

        new InstanceBlock();

        new InstanceBlock(20);

        new InstanceBlock(20, 30);
    }
}