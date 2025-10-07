public class Circle extends Shape {
    private double radius;
    public Circle(Point point, double radius) {
        this.radius = radius;
        super(point);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Circle{" + "radius=" + radius + ",centre=" + centerPoint + '}';
    }
}
