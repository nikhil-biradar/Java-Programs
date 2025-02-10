package stringbuffer.stringbuffermethods;

public class Delete {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Nikhil");
        sb.delete(2, 5);
        System.out.println(sb);
    }
}
