package interview_questions.methodoverloading;

class A
{

}
class B extends A
{

}
class C extends B
{

}

public class Q1
{
    void m1(A a) {
        System.out.println("I am in m1-A");
    }
    void m1(B b) {
        System.out.println("I am in m1-B");
    }
    void m1(C c) {
        System.out.println("I am in m1-C");
    }
}

class OverLoadingTest {
    public static void main(String[] args)
    {
        Q1 obj = new Q1();
// Scene 1:
        A a = new A();
        obj.m1(a);
// Scene 2:
        B b = new B();
        obj.m1(b);
// Scene 3:
        C c = new C();
        obj.m1(c);
// Scene 4:
        B bc = new C();
        obj.m1(bc);
// Scene 5:
        A ab = new B();
        obj.m1(ab);
    }
}