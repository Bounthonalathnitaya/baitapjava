package Shape;

public class TeatAbstractShape {
    public static void main(String[] args){
        Shape c1 = new Circle(3);
        Shape r1 = new Rectangle("width", false,6, 7);
        Shape [] list = {c1, r1};
        for (Shape i: list){
            System.out.println(i.toString());
        }
    }
}
