package exception_handling.unchecked;

public class StringIndexOutOfBoundsEx {
    public static void main(String[] args) {

        String s = "Nikhil";
        for(int i = 0; i <= s.length(); i++){
            System.out.println(i);
        }
    }
}
