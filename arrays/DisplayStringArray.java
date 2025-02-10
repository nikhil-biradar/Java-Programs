package arrays;

//Initialization of String [] array
public class DisplayStringArray {
    public static void main(String[] args) {

        String str [] = {"Nikhil", "Nilesh", "Roshan", "Sandhya", "Ram"};

        for(int i = 0; i < str.length; i++){
            System.out.println("The Position at index " + i + " is : " + str[i]);
        }
    }
}