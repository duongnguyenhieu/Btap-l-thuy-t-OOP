public abstract class Shape {
    public Point centerPoint;
    public static int count;
    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }
    public static int getCount() {
        return count;
    }
    public Point getCenterPoint() {
        return centerPoint;
    }
    public abstract String toString();
}
