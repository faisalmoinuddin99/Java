/*
Problem 2
*/

class Rectangle {

    public int length;
    public int width;

    Rectangle(int len, int wid){
        this.length = len;
        this.width = wid ;
    }
    public double area(){
        return this.length * this.width ;
    }
}
class Cuboid extends Rectangle {
    public int height ;
    Cuboid(int len, int wid, int h) {
        super(len, wid);
        this.height = h;
    }
    public double volume(){
        return this.length * this.width * this.height ;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(2,4,5);
        System.out.println(cuboid.volume()); // 40.0
        System.out.println(cuboid.area()); // 8.0
    }
}