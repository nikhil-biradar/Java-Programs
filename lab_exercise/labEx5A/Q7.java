package lab_exercise.labEx5A;

public class Q7 {
    void m1()
    {
        System.out.println("Super Test7 m1");
    }
    void m2()
    {
        System.out.println("Super Test7 m2");
    }
    void m3()
    {
        System.out.println("Super Test7 m3");
    }
}

class TestQ7 extends Q7 {
    void m1() {
        System.out.println("Subclass Test7 m1");
    }

    void m2() {
        System.out.println("Subclass Test7 m2");
    }

    public static void main(String[] args) {
        TestQ7 t7 = new TestQ7();//Subclass referance variable = subclass object
        t7.m1();
        t7.m2();
        t7.m3();

        System.out.println("\n**********\n");

        Q7 st7 = new Q7();//Super referance variable = super class object
        st7.m1();
        st7.m2();
        st7.m3();

        System.out.println("\n**********\n");

        Q7 st = new TestQ7(); //super class referance variable = Subclass object
        st.m1();
        st.m2();
        st.m3();

        System.out.println("\n**********\n");

        try {
            TestQ7 test77 = (TestQ7) new Q7(); //Subclass referance variable = super calss object

            test77.m1();
            test77.m2();
            test77.m3();
        }catch(ClassCastException e){
            System.out.println("Downcasting not allowed");
        }
    }
}
