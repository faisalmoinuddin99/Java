class Base {
    public Base(){
        System.out.println("I am base class Constructor");
    }
    public Base(int x){
        System.out.println("Base Overloaded Constructor with value of x: " + x);
    }
}

class Dervied extends Base{
    public Dervied(){
        System.out.println("I am derived class Constructor");
    }
    public Dervied(int x, int y){
        super(x);
        System.out.println("Derived Overloaded Constructor with value of  y :" + y);
    }
}
class childOfDervied extends Dervied{
    public childOfDervied(){
        System.out.println("I am child of derived class Constructor");
    }
    public childOfDervied(int x, int y, int z){
        super(x,y);
        System.out.println("child of derived Overloaded Constructor with value of z:" + z);
    }
}

public class Main {
    public static void main(String[] args) {
      // childOfDervied c1 = new childOfDervied();
       /*
       OUTPUT:
        I am base class Constructor
        I am derived class Constructor
        I am child of derived class Constructor
        */
        childOfDervied c = new childOfDervied(10,20,30);
        /*
        Base Overloaded Constructor with value of x: 10
        Derived Overloaded Constructor with value of  y :20
        child of derived Overloaded Constructor with value of z:30
         */
    }
}