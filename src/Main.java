/*
Chapter 11 - Abstract Class and Abstract Methods
 */

abstract class Parent {
    public Parent() {
        System.out.println("Constructor of Base ");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}

class Child2 extends Parent {
    @Override
    public void greet(){
        System.out.println("Bom Dia");
    }
}

abstract class Phone {
    abstract public void switchOff();
    abstract public void switchOn();
}

class Nokia extends Phone{


    public void switchOff(){
        System.out.println("Nokia is shutting down");
    }
    public void switchOn(){
        System.out.println("Nokia is turning on");
    }
}

abstract class Apple extends Phone{
    public void switchOn(){
        System.out.println("Apple is turing on");
    }
}

public class Main {
    public static void main(String[] args) {
       // Parent parent = new Parent(); Object of abstract class cannot be created
        Child c = new Child(); // Constructor of Base
        c.greet(); // Good Morning
        Child2 c1 = new Child2(); // Constructor of Base
        c1.sayHello(); // hello
        c1.greet(); // Bom Dia

       // Apple apple = new Apple();  'Apple' is abstract; cannot be instantiated
        Nokia nokia = new Nokia();
        nokia.switchOn(); // Nokia is turning on
        nokia.switchOff(); // Nokia is shutting down

    }
}

