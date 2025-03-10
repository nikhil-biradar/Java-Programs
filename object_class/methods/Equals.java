package object_class.methods;

public class Equals {
    int x ;

    public Equals(int x) {
        this.x = x;
    }

    public static void main(String[] args) {

        Equals obj1 = new Equals(20);
        Equals obj2 = new Equals(20);

        if(obj1.equals(obj2)){
            System.out.println("Obj1 and Obj2 are same");
        }else {
            System.out.println("Obj1 and Obj2 are not same");
        }

        Integer obj3 = new Integer(20);
        Integer obj4 = new Integer(20);

        if(obj3.equals(obj4)){
            System.out.println("Obj3 and Obj4 are same");
        }else {
            System.out.println("Obj3 and Obj4 are not same");
        }

        String s1 = new String("Java");
        String s2 = new String("Java");

        if(s1.equals(s2)){
            System.out.println("S1 and S2 are same");
        }else {
            System.out.println("S1 and S2 are not same");
        }
    }
}