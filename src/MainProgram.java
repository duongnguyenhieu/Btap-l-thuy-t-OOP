import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Khởi tạo các hình
        shapes.add(new Rectangle(new Point(1, 2), 4, 5));
        shapes.add(new Square(new Point(3, 3), 6));
        shapes.add(new Circle(new Point(0, 0), 7));
        shapes.add(new Rectangle(new Point(5, 1), 3, 8));

        // Số lượng hình đã khởi tạo
        System.out.println("Số lượng hình : " + Shape.getCount());

        // Danh sách chi tiết các hình
        for (Shape shape : shapes) {
            System.out.println("- " + shape.toString());
        }

        // Danh sách tâm điểm
        for (Shape shape : shapes) {
            System.out.println("- " + shape.getCenterPoint());
        }
    }
}
