package lab_exercise.labEx5A;

//Write program with overloaded methods. Call them
public class Q10 {

    public void add(int a, long b){
        long c = a + b;
        System.out.println(c);
    }

    public void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Q10 obj = new Q10();
        obj.add(10, 2000);
        obj.add(10, 20);
    }
}

