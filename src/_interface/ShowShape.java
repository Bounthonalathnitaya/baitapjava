package _interface;

public class ShowShape {
    public static void main(String[] args){
        IShape c1 = new Circle(3);
        IShape r1 = new Recltangle(3,4);
        IShape r2 = new Recltangle(4,5);
        IShape[] list = {c1,r1,r2};
        for (IShape s: list){
            System.out.println(s.getArea()+"\n"+s.getPerimeter());
        }
    }
}
