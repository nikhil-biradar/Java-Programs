package java_programs;

public class Arrays {
    public static void main(String[] args) {
        String [] cars = {"Volvo", "BMW", "Mercedes", "Ford", "Toyota"};

        int [] myNum = {10, 20, 30, 40, 50, 60};

        System.out.println("Integer at index 3 is : " + myNum[3]);
        System.out.println("Length of Cars : " + cars.length);
        System.out.println("Length of Integers : " + myNum.length);

        for(int i=0; i<cars.length; i++){
            System.out.print(cars[i] + " ");
        }
    }
}
