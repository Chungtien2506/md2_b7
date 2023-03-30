package interfaceResizable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.resize(10);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(10,5);
        rectangle.resize(10);
        System.out.println(rectangle);

        Square square = new Square(10);
        square.resize(10);
        System.out.println(square);
    }
}
