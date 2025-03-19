package practice_programs.string;

public class CharacterOccurrence  {
    public static void main(String[] args) {

        String name = "Nikhil";
        int count = 0;

        for(int i=0; i<name.length(); i++){
            for(int j=0; j<name.length(); j++){
                if(name.charAt(i) == name.charAt(j)){
                    count ++;
                }
            }
            System.out.println(name.charAt(i) + " occurs " + count + " times ");
            count = 0;
        }
    }
}
