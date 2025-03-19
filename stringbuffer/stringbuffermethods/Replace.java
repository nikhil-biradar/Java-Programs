package stringbuffer.stringbuffermethods;

public class Replace {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Nikhil Balaji Biradar");
        sb.replace(7, 13, "Bhau");
        System.out.println(sb);
    }
}
