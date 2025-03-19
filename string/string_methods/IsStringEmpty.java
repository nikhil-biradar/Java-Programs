package string.string_methods;

public class IsStringEmpty {
    public static void main(String[] args) {
        String str = "";
        boolean isEmpty1 = str.isEmpty();
        System.out.println("Is String empty: " +isEmpty1);

        String str2 = " ";
        boolean isEmpty2 = str2.isEmpty();
        System.out.println("Is String empty: " +isEmpty2);

    }
}