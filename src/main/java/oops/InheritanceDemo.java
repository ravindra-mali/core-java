package oops;

/*
    Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
    Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
    Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
    Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class.
    You can use the same fields and methods already defined in the previous class.

    Note: Multiple inheritance is not supported in Java through class

 */

// Single Inheritance

class Employee{
    float salary=40000;
}

class Programmer extends Employee{
    int bonus=10000;
}


// multilevel Inheritance
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}

class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}

class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}

public class InheritanceDemo {

    public static void main(String args[]){

        System.out.println("Single Inheritance");
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);

        System.out.println("Multilevel Inheritance");
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();

        System.out.println("Hierarchical Inheritance");
        Dog d1=new Dog();
        d1.bark();
        d1.eat();
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}


