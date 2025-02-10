package arrays;

public class ArrayInitialization {

    public static void main(String[] args) {


        //Int type
        int arr[] = new int[3];
        System.out.println("Array Initialization of Int Type");
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "]: " + arr[i]);
        }

        //Boolean type
        boolean arrb[] = new boolean[3];
        System.out.println("Array Initialization of Boolean Type");
        for(int i = 0; i < arrb.length; i++){
            System.out.println("arrb[" + i + "]: " + arrb[i]);
        }

        //String type
        String str[] = new String[3];
        System.out.println("String Initialization of String Type");
        for(int i = 0; i < str.length; i++){
            System.out.println("str[" + i + "]: " + str[i]);
        }

        //Float type
        float floats[] = new float[3];
        floats[0] = 1.1f;
        floats[1] = 2.1f;
        floats[2] = 3.1f;

        System.out.println("String Initialization of Float Type");
        for(int i = 0; i < floats.length; i++){
            System.out.println("flo[" + i + "]: " + floats[i]);
        }
    }
}

