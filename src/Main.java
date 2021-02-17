/*

INHERITANCE - CHAPTER - 10
 */

class Base {

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void display(){
        System.out.println("I am Base class");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class  Main {

    public static void main(String[] args) {
       Derived d1 = new Derived() ;
       d1.setX(60);
        System.out.println("Value of X " + d1.getX()); // Value of X 60
        d1.display(); // I am Base class
        d1.setY(100);
        System.out.println("Value of Y " + d1.getY()); // Value of Y 100
    }
}