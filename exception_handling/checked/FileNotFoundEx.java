package exception_handling.checked;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundEx {
    public static void main(String[] args) {

        File file = new File("not_existing_file.txt");

        //Exception occured at compile time
//        FileInputStream stream = new FileInputStream(file);

        try {
            FileInputStream stream = new FileInputStream(file);

        } catch (FileNotFoundException e) {
            System.out.println("The entered path is not correct, file not found");
        }
    }
}
