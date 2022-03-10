package oops;

/*

    There are two ways to overload the method in java
        By changing number of arguments
        By changing the data type
    In Java, Method Overloading is not possible by changing the return type of the method only.

    One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.



    Rules for Java Method Overriding
        The method must have the same name as in the parent class
        The method must have the same parameter as in the parent class.
        There must be an IS-A relationship (inheritance).

 */

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }

    void sum1(long a, long b) {
        System.out.println("long arg method invoked");
    }

}

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

//Creating child classes.
class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}


public class PolymorphismPractice {

    public static void main(String args[]) {
        Adder calculator = new Adder();
        calculator.sum(10, 20);
        calculator.sum1(10, 20);

        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(15.2, 15.6));
        System.out.println(Adder.add(11, 11, 11));

        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest());
    }
}
