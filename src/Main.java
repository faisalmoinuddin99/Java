/*
CHAPTER 10 - Practice Set
 */

class Circle {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double AreaOfCircle(){
        return  Math.PI * Math.pow(this.radius,2) ;
    }
    public double perimeterOfCircle(){
        return 2 * Math.PI * this.radius;
    }
}
class Cylinder extends Circle{
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }
    public double volume(){
        return AreaOfCircle() * this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(4);
        cylinder.setHeight(5);
        System.out.println(cylinder.AreaOfCircle());
        System.out.println(cylinder.volume());
    }
}
/*
Output :
50.26548245743669
251.32741228718345
 */