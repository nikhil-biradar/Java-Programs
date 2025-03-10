package object_class.methods;

public class Hashcode {
    public static void main(String[] args) {

        Integer obj = new Integer(20);
        String s1 = new String("java");

        System.out.println(obj.hashCode());
        System.out.println(s1.hashCode());
    }
}