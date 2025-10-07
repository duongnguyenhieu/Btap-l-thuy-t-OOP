public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(Point point,double length,double width) {
        this.length = length;
        this.width = width;
        super(point);
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public String toString(){
        return "Rectangle{" + "length=" + length + ", width=" + width  + ",centre=" + centerPoint + '}';
    }
}
