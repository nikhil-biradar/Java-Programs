package java_programs;

    public class CallObjects {
        public static void main(String[] args) {
            CallObjects obj = new CallObjects();
            obj.printMessage();
            obj.printInteger(100);
            obj.printFloat(2.3f);
            obj.multipleParam(5, true, 'A', 20.99, 5.9f);
            obj.printAnimal("Dog");
        }

    void printMessage(){
        System.out.println("This is a test message");
    }

    void printInteger(int num){
        System.out.println("Integer value is : " + num);
    }

    void printFloat(float f){
        System.out.println("Float value is : " + f);
    }

    void multipleParam(int a, boolean b, char c, double d, float f){
        System.out.println("Multiple Parameters are : " + a  + " " + b + " " + c + " " + d + " " +  " " + f);
    }

    void printAnimal(String d){
        System.out.println("Animal name is : " + d );
    }
}
