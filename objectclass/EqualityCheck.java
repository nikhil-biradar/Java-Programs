package objectclass;

public class EqualityCheck {

    public static void main(String[] args) {

        MyClass obj1 = new MyClass(23);
        MyClass obj2 = new MyClass(20);

        if(obj1.equals(obj2)){
            System.out.println("obj1 and obj2 are equal");
        } else {
            System.out.println("obj1 and obj2 are not equal");
        }

//        Integer obj3 = new Integer(20);
//        Integer obj4 = new Integer(20);

        String obj3 = new String("Nikhil");
        String obj4 = new String("Nikhil");

        if(obj3.equals(obj4)){
            System.out.println("obj3 and obj4 are equal");
        } else {
            System.out.println("obj3 and obj4 are not equal");
        }
    }
}
