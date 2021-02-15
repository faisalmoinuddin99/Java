/*
Practice Set 9
 */

class Cylinder {
    private int radius;
    private int height ;

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

public class Main{
    public static void main(String[] args) {
Cylinder c1 = new Cylinder() ;{
    c1.setHeight(5);
    c1.setRadius(2);
            System.out.println(c1.getHeight()); // 5
            System.out.println(c1.getRadius()); // 2
            System.out.println(c1.surfaceAreaOfCylinder()); // 87.96459430051421
            System.out.println(c1.volumeOfCylinder()); // 62.83185307179586

        }
    }
}