package statics;

public class MixMethods {

    static void show(){
        System.out.println("This is Static Method - 1 ");
        MixMethods m1 = new MixMethods();
        m1.dummy();
        m1();
    }


    static void m1(){
        System.out.println("This is Static method - 2 ");
    }

    void dummy(){
        System.out.println("This is Instance Method - 3 ");
        m2();
    }

    void m2(){
        System.out.println("This is Instance method - 4 ");
    }

    public static void main(String[] args) {
        show();
    }
}
