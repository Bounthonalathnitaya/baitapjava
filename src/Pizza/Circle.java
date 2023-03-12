package Pizza;

public class Circle implements IShape{
    double _radius;

    public Circle(double somsac) {
        this._radius = somsac;
    }

    @Override
    public double getArea() {
        return 3.14 * _radius *_radius;
    }

    @Override
    public String toString() {
        return "Hinh tron co ban kinh:" + _radius;
    }
}


