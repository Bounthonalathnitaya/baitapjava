package _interface;

public class Recltangle implements IShape{
    double Width;
    double Length;
    public Recltangle(double width, double length){
        this.Width = width;
        this.Length = length;
    }
    @Override
    public double getArea() {
        return Width*Length;
    }

    @Override
    public double getPerimeter() {
        return 2*Length*Width;
    }
}
