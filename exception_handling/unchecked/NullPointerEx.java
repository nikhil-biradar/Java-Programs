package exception_handling.unchecked;

public class NullPointerEx {

    void show(){
        System.out.println("Show Method");
    }

    void m1(){
        System.out.println("m1 Method");    
    }

    public static void main(String[] args) {

        NullPointerEx npe = null;

        if(npe == null){
            npe = new NullPointerEx();
            npe.show();
        }
        npe.m1();
    }
}