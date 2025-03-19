package interview_questions.methodoverriding;

// What will be the output of the following program?

import java.io.IOException;

class One {
    void m1() throws Throwable {
        System.out.println("m1-One");
    }
}

class Twoo extends One {
    @Override
    protected void m1() throws Exception {
        System.out.println("m1-Two");
    }
}


class Threee extends Twoo {
    @Override
    public final void m1() throws IOException {
        System.out.println("m1-Three");
    }
}

public class Q14 {
    public static void main(String[] args) throws Throwable {
        One o = new Twoo();
        o.m1();
        Two t = new Three();
        t.m1();
        Three th = new Three();
        th.m1();
    }
}