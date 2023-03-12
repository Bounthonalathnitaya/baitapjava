package Shape;
public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        setWidth(side);
    }
    public void setLength(double side){
        setLength(side);
    }

    @Override
    public String toString() {
        return "Spuare{" + "width=" + ",length=" + length + ",color='" + '\'' + ", filled=" + filled + '}';
    }
}