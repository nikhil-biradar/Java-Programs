package oops.polymorphism;

public class Calculator {

    public void calculate(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public void calculate(int a, float b){
        float mul = a * b;
        System.out.println(mul);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.calculate(10, 20);
        cal.calculate(10, 10.0f);
    }
}