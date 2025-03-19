package lab_exercise.labEx4;

public class Q8 {
    //instance variable

    int x = 10;
    int y = 20;

    //instance method m1
    void m1(int a, int b) {
        x = a;
        y = b;
    }

    //instance method m2
    void m2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //main method
    public static void main(String[] args) {
        //object creation
        Q8 t = new Q8();
        System.out.println("Before m1 " + t.x + "....." + t.y);
        //calling m1 method
        t.m1(30, 40);
        System.out.println("After m1 " + t.x + "....." + t.y);
        //calling m2 method
        t.m2(50, 60);
        System.out.println("After m2 " + t.x + "....." + t.y);

    }
}