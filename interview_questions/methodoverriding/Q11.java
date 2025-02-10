package interview_questions.methodoverriding;

// Can you identify error in the below code snippet?

import java.io.IOException;

public class Q11 {
    public Object m1(char c) {
        return null;
    }
}

class E extends P {
    public String m1(char c) throws IOException {
        return null;
    }
}