package interfaceColorable;

public class Square implements Colorable{
    private double edge;

    public Square() {
    }

    public Square(double radius) {
        this.edge = radius;
    }

    public double getRadius() {
        return edge;
    }

    public void setRadius(double radius) {
        this.edge = radius;
    }
    public  double getArea(){
        return  edge*edge;
    }

}
