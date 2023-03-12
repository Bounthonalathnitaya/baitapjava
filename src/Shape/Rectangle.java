package Shape;

public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
        super();
        width = -1;
        length = -1;
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color,boolean filled,double width,double length) {
        super(color,filled);
        this.width = width;
        this.length= length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimter() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
