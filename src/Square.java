public class Square extends Shape {
    private double edge;
    public Square(Point point, double edge) {
        super(point);
        this.edge = edge;
    }
    public double getEdge() {
        return edge;
    }
    public void setEdge(double edge) {
        this.edge = edge;
    }
    @Override
    public String toString() {
        return "Square{" + "edge=" + edge + ",centre=" + centerPoint + '}';
    }
}
