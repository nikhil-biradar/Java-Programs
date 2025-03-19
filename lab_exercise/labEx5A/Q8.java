package lab_exercise.labEx5A;

public class Q8 {
    static void m1()
    {
        System.out.println("Super m1 static");
    }
    void m2()
    {
        System.out.println("Super m2 non static ");
    }
}

class TestQ8 extends Q8 {
    static void m1()
    {
        System.out.println("sub m1 static");
    }
    void m2()
    {
        System.out.println("sub m2 non static ");
    }
    public static void main(String[] args) {
        Q8 st= new Q8();
        st.m2();
        st.m1();
        System.out.println("******");
        Q8 t= new TestQ8();
        t.m2();
        t.m1();
    }
}
