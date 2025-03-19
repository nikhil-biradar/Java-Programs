package lab_exercise.labEx5A;

public class Q4 {
    public void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
}

class TestQ4 extends Q4 {
    @Override
    public void add(int a, int b) {
        super.add(a, b);
    }

    public static void main(String[] args) {
        TestQ4 c1 = new TestQ4();
        c1.add(10, 20);
    }
}