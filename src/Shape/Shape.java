package Shape;

public abstract class Shape {
    String color;
    boolean filled;
    public Shape(){
        this.color ="No color";
        this.filled = false;
    }
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimter();

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
        }

        public String getColor() {
            return color;
        }

        public void setWidth(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled() {
            this.filled = filled;
        }
    }

