package practice_programs.string;

/*
public class CharacterCount {
    public static void main(String[] args) {
        String s1 = "Programming java java";

        int totallen = s1.length();

        int aftercount = s1.replace("a","").length();

        int totalcount = totallen - aftercount;
        System.out.println(totalcount);
    }
}
*/


public class SpecificCharCount {
    public static void main(String[] args) {
        String str = "Java";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}