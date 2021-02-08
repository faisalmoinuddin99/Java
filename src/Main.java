 /*
 Practice Set
  */

class CellPhone {

    public  void ring(){
        System.out.println("ringing");
    }

    public void vibrate(){
        System.out.println("Vibrating");
    }
}

class Rectangle {
    int length ;
    int width ;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return length * width ;
    }
    public int perimeter(){
        return 2 * (length + width) ;
    }
}

class TommyViceCity {
    public void hit(){
        System.out.println("Hitting ...");
    }
    public void run(){
        System.out.println("Running ...");
    }
    public void fire(){
        System.out.println("Firing ...");
    }
}

public class Main {

    public static void main(String[] args) {

    CellPhone c1 = new CellPhone();
    c1.ring();
    c1.vibrate();

    Rectangle s1 = new Rectangle();
    s1.setLength(5);
    s1.setWidth(5);
        System.out.println("Area of Square : " + s1.area());
        System.out.println("Perimeter of Square : " + s1.perimeter());

        TommyViceCity tommy = new TommyViceCity() ;
        tommy.run();
        tommy.fire();
        tommy.hit();
    }
    /*
    Running ...
    Firing ...
    Hitting ...
     */

}
