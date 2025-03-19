package weekly_coding_test;

public class DisplayOddEven {
    public static void main(String[] args) {

        int arr [] = {1, 2, 3, 4, 5, 6};

        System.out.print("Even Numbers : ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd Numbers : ");
        for(int i=0; i< arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
