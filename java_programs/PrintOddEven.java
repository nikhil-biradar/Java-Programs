package java_programs;

public class PrintOddEven {
    public static void main(String[] args) {
        int arr [] = {32, 67, 38, 59, 48, 7, 39, 10, 22, 15, 98, 91};

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}


        /*
        System.out.println();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr1.length; j++){
                for(int k=0; k<even.length; k++){
                    if(arr[i] == arr1[j] && arr[i] == even[k]){
                        System.out.print(arr[i] + " ");
                    }
                }
            }
        }

        System.out.println();
        for(int a=0; a<arr.length; a++){
            for(int b=0; b<arr1.length; b++){
                for(int c=0; c<even.length; c++){
                    if(arr[a] != arr1[b] && arr[a] != even[c]){
                        System.out.print(even[c] + " ");
                    }
                }
            }
        }
    }
}
*/
