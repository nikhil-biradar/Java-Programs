package lab_exercise.labEx3;

public class Test {
    final int x;

    public Test(int x) {
        this.x = x;
    }

    public static void main(String[]args) {
        Test t= new Test(25);
        System.out.println(t.x);
    }
}
