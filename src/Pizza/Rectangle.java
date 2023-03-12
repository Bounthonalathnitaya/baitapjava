package Pizza;

public class Rectangle implements IShape {
    double _Width;
    double _height;

    public Rectangle(double w, double h){
        this._Width = w;
        this._height = h;
    }
    @Override
    public double getArea() {
        return _Width * _height;
    }

    @Override
    public String toString() {
        return "Rectangle{h"+ _height + ",w"+ _Width +" }";
    }
}
