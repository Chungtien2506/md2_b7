package Comparable;

public class Cricle {
    private double radius ;

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                '}';
    }
}
