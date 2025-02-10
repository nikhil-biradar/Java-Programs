package arrays;

public class DefaultValues {

    public static void main(String[] args) {

        String arr [] = new String [5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr.length);
    }
}