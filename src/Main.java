class Base {
    public Base() {
        System.out.println("I am constructor");
    }
}

class Derived extends Base {
    public Derived() {
        System.out.println("I am derived constructor");
    }
}
public class Main {
    public static void main(String[] args) {
        Base b1 = new Base(); // I am constructor

        Derived d1 = new Derived();
        /*
        I am constructor
        I am derived constructor
        */

    }
}