package stringbuffer.stringbuffermethods;

public class DeleteChartAt {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Nikhil");
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}
