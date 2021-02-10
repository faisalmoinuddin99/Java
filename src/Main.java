class Rectangle {
    private int length;
    private int width ;

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

    public int getArea(){
        return this.length * this.width ;
    }
}
public class Main{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(10);
        r1.setWidth(2);
        System.out.println(r1.getArea());
    }
}