package practice_programs.string;

public class WordCount {
    public static void main(String[] args) {

        String s = "Java Programs are easy";
        String [] str = s.split(" ");
        int count = 0;

        //1st way
        System.out.println("Length is : " + str.length);

        //2nd way
        //Using for loop
//        for(int i = 0; i < str.length; i++){
//            count ++;
//        }

        //3rd way
        for(String str1 : str){
            count ++;
        }

        System.out.println(count);
    }
}
