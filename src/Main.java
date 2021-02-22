class A {
  public void printName() {
      System.out.println("I am in class A");
    }
}

class B extends A {

    @Override
    public void printName(){
        System.out.println("I am in class B");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.printName();

        B b = new B();
        b.printName();
    }
}