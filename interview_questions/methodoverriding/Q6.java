package interview_questions.methodoverriding;

//What will be the output of the following program?

class X1 {
    void draw(int a, float b) throws Throwable {
        System.out.println("Circle");
    }
}

class Y1 extends X1 {
    @Override
    void draw(int a, float b) {
        System.out.println("Rectangle");
    }
}

class Z extends Y1
{
    @Override
    void draw(int a, float b) throws ArithmeticException
    {
        System.out.println("Square");
    }
}
public class Q6
{
    public static void main(String[] args) throws Throwable
    {
        X1 x = new Y1();
        x.draw(20, 30.5f);
        Y1 y = (Y1)x;
        y.draw(10,2.9f);
        Z z = (Z)y;
        z.draw(20, 30f);
    }
}
