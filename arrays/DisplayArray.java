package arrays;

//Initialization of int [] array
public class DisplayArray {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};

        for(int i = 0; i < arr.length; i++){
            System.out.println("The position at index " + i + " is : " + arr[i]);
        }
    }
}
