package stringbuffer.stringbuffermethods;

public class TrimToSize {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Nikhil Balaji Biradar");
        sb.append("Nikhil Pushpa Balaji Biradar");
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

        System.out.println(sb.hashCode());
        System.out.println(sb.getClass());

    }
}
