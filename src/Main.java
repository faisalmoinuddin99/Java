class Base {
    public Base() {
        System.out.println("Constructor of Base class");
    }
}
class Derived1 extends Base {
    public Derived1() {
        System.out.println("Constructor of Derived1 class");
    }
}
class Derived2 extends Derived1{
    public Derived2() {
        System.out.println("Constructor of Derived2 class");
    }
}
public class Main{
    public static void main(String[] args) {
        Derived2 derived2 = new Derived2();
    }
}
/*
. In Java, constructor of base class with no argument gets automatically called in derived class constructor. For example, output of following program is:

Constructor of Base class
Constructor of Derived1 class
Constructor of Derived2 class

. But, if we want to call parameterized constructor of base class, then we can call it using super(). The point to note is base class constructor call must be the first line in derived class constructor. For example, in the following program, super(_x) is first line derived class constructor.
 */