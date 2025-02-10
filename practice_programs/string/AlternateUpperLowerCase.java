package practice_programs.string;

public class AlternateUpperLowerCase {
    public static void main(String[] args) {

        String str = "nikhil";

        String newString = "";

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c % 2 == 0){
                newString += Character.toUpperCase(c);
            }else{
                newString += Character.toLowerCase(c);
            }
        }
        System.out.println(newString);
    }
}