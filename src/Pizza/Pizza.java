package Pizza;

public class Pizza implements IShape {
    double _price;
    IShape _Shape;

    public Pizza(double p,double s) {
        _price = p;
        _Shape = s;
    }

    @Override
    public double getArea() {
        return 0;
    }

}
