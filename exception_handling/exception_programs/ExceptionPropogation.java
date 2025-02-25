package exception_handling.exception_programs;

public class ExceptionPropogation {

    void m1(){
        m2();
    }

    void m2(){
        m3();
    }

    void m3(){
        m4();
    }

    void m4(){
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        ExceptionPropogation e = new ExceptionPropogation();
        e.m1();
    }
}
