package java_programs;

public class Operators {
    public static void main(String[] args) {
    int a = 20;
    int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}

// Unary operators

class Unaryoperators{
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("PostIncrement : " + (a++)); //10 now a is 11
        System.out.println("PreIncrement : " + (++a)); // 12
        System.out.println("PostIncrement : " + (b--)); //10 now a is 9
        System.out.println("PreIncrement : " + (--b)); // 8

    }
}

//Assignment Operators

class AssignmentOperators{
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a += 10 : " + (a += 10));
        System.out.println("a -= 10 : " + (a -= 10));
        System.out.println("a *= 10 : " + (a *= 10));
        System.out.println("a /= 10 : " + (a /= 10));
        System.out.println("a %= 10 : " + (a %= 10));
    }
}

//Relational Operators

class RelationalOperators{
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

    }
}