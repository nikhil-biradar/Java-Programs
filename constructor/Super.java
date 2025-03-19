package constructor;

class GrandSuper {
    GrandSuper(){
        System.out.println("Class GrandSuper's no-arg Constructor");
    }
}
class ParentSuper extends GrandSuper {

    ParentSuper(){
        System.out.println("Class SuperKeyword's No arg Constructor");
    }
    ParentSuper(String name){
        System.out.println("Class SuperKeyword's Param Constructor with 1 params");
    }

    ParentSuper(String name, int age){
        System.out.println("Class SuperKeyword's Param Constructor with 2 params" + " name is " + name + " age is " + age);
    }
}

public class Super extends ParentSuper {
    Super(String s, int a){
        super("Rahul", 30);
        System.out.println("Class Super's Param Constructor with 2 params");
    }

    public static void main(String[] args) {
        Super s = new Super("Nitin", 24);
    }
}