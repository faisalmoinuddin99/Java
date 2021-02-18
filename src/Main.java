class GrandParent {
    int land ;
    public GrandParent() {
        System.out.println("25 acer land");
    }
    public GrandParent(int son ){
       land =  25 / son ;
        System.out.println("Overloaded GrandParent Constructor " +
                "Divide the land : " + land);
    }
}

class Parent extends GrandParent{
   int cars ;
    public Parent() {
        //super(4); // Calling the Overloaded Constructor
        /*
        if super() is empty then its call the normal constructor
         */
        System.out.println("40 Cars");
    }
    public Parent(int children){
        super(4);
        cars = 40 / children ;
        System.out.println("Parent Overloaded Constructor " +
                "Car is divided equally to all the kids " + cars);
    }
}

class Child extends Parent {
    public Child() {
        super(2);
        System.out.println("I have an iPhone");
    }
    public Child(int x, int y){
        System.out.println("Child's Overloaded Constructor Value of x and y " + x +  " " + y);
    }
}

public class Main {
    public static void main(String[] args) {
//        Child c1 = new Child();
        Child c = new Child(4,5);
    }
}