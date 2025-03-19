package lab_exercise.labEx3;

//Protected
//class C {
//    protected void displayC(){
//        System.out.println("This is Protected Method of Class C");
//    }
//}
//
//public class Q2 extends C {
//    protected void display(){
//        System.out.println("This is Protected Method of Class Q2");
//    }
//
//    public static void main(String[] args) {
//        Q2 obj = new Q2();
//        obj.displayC();
//        obj.display();
//    }
//}

//Default
//public class Q2 {
//    int a = 10;
//    int b = 20;
//
//    void add(){
//        int c = a+b;
//        System.out.println(c);
//    }
//}

//Public
public class Q2 extends Public {
    public static void main(String[] args) {
        Q2 obj = new Q2();
        obj.vehicle();
        obj.bark();
    }
}