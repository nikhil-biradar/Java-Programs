package oops.abstraction;

abstract class Bank {
    abstract int getRateOfIntrest();
}

class SBI extends Bank {
    @Override
    int getRateOfIntrest() {
        return 7;
    }
}

class PNB extends Bank {
    @Override
    int getRateOfIntrest() {
        return 8;
    }
}

public class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Intrest for SBI bank is : " + b.getRateOfIntrest() + "%");

        b = new PNB();
        System.out.println("Rate of Intrest for PNB bank is : " + b.getRateOfIntrest() + "%");

    }
}