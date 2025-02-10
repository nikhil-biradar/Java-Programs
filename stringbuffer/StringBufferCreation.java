package stringbuffer;

public class StringBufferCreation {
    public static void main(String[] args) {

        //1st Way
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");

        System.out.println("Length of sb : " + sb.length());
        System.out.println("Capacity of sb : " + sb.capacity());

        //2nd Way
        StringBuffer sb1 = new StringBuffer("Tech");
        int length = sb1.length();
        int capacity = sb1.length() + 16;

        System.out.println("Length of sb1 : " + length);
        System.out.println("Capacity of sb1 : " + capacity);

        //3rd Way
        StringBuffer sb2 = new StringBuffer(30);
        System.out.println("Capacity of sb2 : " + sb2.capacity());


    }
}
