

/*
Practice Set 9
 */

class Cylinder {
    private int radius;
    private int height ;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceAreaOfCylinder(){
        return 2 * Math.PI * this.radius * this.height + 2 * Math.PI * Math.pow(this.radius, 2);
    }

    public double volumeOfCylinder(){
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }
}

 class  Rectangle {
    private  int length;
    private int breadth;

     public Rectangle() {
         this.length = 3;
         this.breadth = 5 ;
     }

     public Rectangle(int length, int breadth) {
         this.length = length;
         this.breadth = breadth;
     }

     public int getLength() {
         return length;
     }

     public int getBreadth() {
         return breadth;
     }
 }

public class Main{
    public static void main(String[] args) {
Cylinder c1 = new Cylinder(2,5) ;{
//    c1.setHeight(5);
//    c1.setRadius(2);
//            System.out.println(c1.getHeight()); // 5
//            System.out.println(c1.getRadius()); // 2
            System.out.println(c1.surfaceAreaOfCylinder()); // 87.96459430051421
            System.out.println(c1.volumeOfCylinder()); // 62.83185307179586

            Rectangle r1 = new Rectangle(2,4);
            System.out.println(r1.getBreadth()); // 4
            System.out.println(r1.getLength()); // 2
        }
    }
}

