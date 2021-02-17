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

class Animal {
    public void multiCellular(){
        System.out.println("Animals are multicellular");
    }

    public void reproduce(){
        System.out.println("Animals typically reproduce sexually");
    }
}

class Cat extends Animal{
    int numberOfLegs;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
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

        Cat c1 = new Cat();
        c1.setNumberOfLegs(4);
        System.out.println(c1.getNumberOfLegs()) ; // 4
        c1.multiCellular(); // Animals are multicellular
        c1.reproduce(); // Animals typically reproduce sexually


    }
}