package interview_questions.methodoverriding;

// What will be the output of the following program?

class XY
{
    protected Number m1(int a)
    {
        System.out.println("One");
        return null;
    }
    Object m2()
    {
        System.out.println("Two");
        return null;
    }
}
class YZ extends XY
{
    protected String m2()
    {
        System.out.println("Three");
        return null;
    }
}
public class Q12
{
    public static void main(String[] args)
    {
        XY xy = new YZ();
        xy.m1(20);
        xy.m2();
    }
}