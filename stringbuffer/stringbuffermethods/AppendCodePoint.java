package stringbuffer.stringbuffermethods;

public class AppendCodePoint {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}