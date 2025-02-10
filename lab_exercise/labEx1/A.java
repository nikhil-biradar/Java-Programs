package lab_exercise.labEx1;

// 8) What is the output of below program ?

//public class A {
//    public static void main(String[] args) {
//        System.out.println("A main");
//        m1();
//    }
//    public static void m1() {
//        System.out.println("A m1");
//        main(new String[0]);
//    }
//}

// 7) What is the output of below program ?

//public class A
//{
//    public static void main(String[] args)
//    {
//        System.out.println ("A main string array");
//    }
//    public static void main(String args)
//    {
//        System.out.println ("A main only string");
//    }
//    public static void main (int [] args)
//    {
//        System.out.println ("1");
//    }
//}

// 6) Write a program to call A class main method from B class main method?

//public class A {
//    public static void main(String [] args) {
//        System.out.println("This is A's main method.");
//    }
//}

// 5) In Single java file can we define main method in all classes ? Write program with above concept.

//public class A {
//    public static void main(String[] args) {
//        System.out.println("This is Class A's main method.");
//    }
//}
//
//class B {
//    public static void main(String[] args) {
//        System.out.println("This is Class B's main method.");
//    }
//}
//
//class C {
//    public static void main(String[] args) {
//        System.out.println("This is Class C's main method.");
//    }
//}

// 4) Write a program with same method in different class.

//public class A {
//    public static void main(String[] args) {
//        A.show();
//        B.show();
//        C.show();
//        D.show();
//    }
//    public static void show(){
//        System.out.println("This is class A's method");
//    }
//}
//
//class B {
//    public static void show(){
//        System.out.println("This is class B's method");
//    }
//}
//
//class C {
//     public static void show(){
//         System.out.println("This is class C's method");
//     }
// }
//
//class D {
//    public static void show(){
//        System.out.println("This is class D's method");
//    }
//}

// 2)	Write a program with one user defined method calling another user defined method.

//public class A {
//
//    public void firstMethod(){
//        System.out.println("This is class A's first method.");
//        secondMethod();
//    }
//
//    public void secondMethod(){
//        System.out.println("This is class A's second method.");
//    }
//
//    public static void main(String[] args) {
//        A obj = new A();
//        obj.firstMethod();
//    }
//}

//3) If class does not have main method, how can we execute user defined methods of that class ?

class B {
    public void sayHello(){
        System.out.println("Hello this is non-static method.");
    }

    public static void sayHi(){
        System.out.println("Hi! this is static method.");
    }
}

public class A {
    public static void main(String[] args) {
        B obj = new B();
        obj.sayHello();

        B.sayHi();
    }
}
