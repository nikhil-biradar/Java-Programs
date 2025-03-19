package practice_programs;

public class PrivateVariable {

    protected int a;

    PrivateVariable(int i){
        this.a = i;
        System.out.println(a);
    }
}

class AccessVariable {
    public static void main(String[] args) {
        PrivateVariable a = new PrivateVariable(10);
        System.out.println(a.a);
    }
}