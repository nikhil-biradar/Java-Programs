package interview_questions.methodoverriding;

//Can you identify how many errors are in the below snippet code?

public class Q15 {
    protected void color(char r) {
        System.out.println("Red");
    }
}

class Marigold extends Q15 {
//    @Override
//    void color(char m) throws NullPointerException
    {
        System.out.println("Orange");
    }
}

class Sunflower extends Marigold
{
//    @Override
//    protected final void color(char s) throws IOException
    {
        System.out.println("Yellow");
    }
}