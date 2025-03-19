package lab_exercise.labEx5A;

//Write Program explaining how super class static and non-static variables are shared all its subclass

public class Q3 {
    static int staticVar = 100;
    int instanceVar = 50;
}

class TestQ3 extends Q3 {
    public void display(){
        System.out.println("Static Variable : " + staticVar);
        System.out.println("Instance Variable : " + instanceVar);
    }
    public static void main(String[] args) {
        TestQ3 sb = new TestQ3();
        sb.display();

        sb.staticVar = 200;
        sb.instanceVar = 150;

        System.out.println("After Modification : ");
        TestQ3 sb1 = new TestQ3();
        sb1.display();
    }
}
