package object_class.methods;

public class ToString {
    public static void main(String[] args) {

        Integer obj = new Integer(123);
        String str = obj.toString();
        System.out.println("String Representation : " + str);
        System.out.println(str + 456);
        System.out.println("Integer Number : " + obj + 456);
    }
}