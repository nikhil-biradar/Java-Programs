package stringbuilder;

public class StringBuilderCreation {
    public static void main(String[] args) {

        //1st way
        StringBuilder sb = new StringBuilder(); //Creates Empty String with initial capacity 16
        System.out.println(sb);
        System.out.println(sb.capacity());

        //2nd Way
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1);
        System.out.println(sb1.capacity());

        //3rd Way
        StringBuilder sb2 = new StringBuilder(40); //Initial capacity is 40
        System.out.println(sb2);
        System.out.println(sb2.capacity());

        //4th Way
        CharSequence sb3 = "Nikhil";
        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println(sb3);
        System.out.println(sb4);
        System.out.println(sb4.capacity());
    }
}
