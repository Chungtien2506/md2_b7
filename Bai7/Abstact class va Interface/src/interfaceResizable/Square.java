package interfaceResizable;

public class Square implements Resizeable {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public void resize(double percent) {
        edge += edge*percent/100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }
}
