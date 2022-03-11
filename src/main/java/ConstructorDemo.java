
/*
        There are two rules defined for the constructor.
            Constructor name must be the same as its class name
            A Constructor must have no explicit return type
        A Java constructor cannot be abstract, static, final, and synchronized

        Note: We can use access modifiers while declaring a constructor. It controls the object creation. In other words, we can have private, protected, public or default constructor in Java.

        Rule: If there is no constructor in a class, compiler automatically creates a default constructor.


 */

import java.util.List;

class Owner {

    String name;
    long contactNo;
    String uid;

    public Owner(String name,String uid,long contactNo){
        this.name = name;
        this.uid = uid;
        this.contactNo = contactNo;
    }

}

class Vehicle {

    int noOfWheels;
    Owner owner;

    public Vehicle(int noOfWheels, Owner owner){
        this.noOfWheels = noOfWheels;
        this.owner = owner;
        System.out.println("Vehicle is created");
     }
}

class Bike extends Vehicle{

    String vehicleNo;

    Bike() {
        super(2,new Owner("Ravindra","89562341789",895623890));
        System.out.println("Bike is created");
    }
}

public class ConstructorDemo {
    public static void main(String args[]) {
        Bike b = new Bike();
    }
}
