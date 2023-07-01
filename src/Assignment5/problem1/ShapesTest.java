package Assignment5.problem1;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("White", 10, 10);
        Rectangle rectangle1 = new Rectangle("Blue", 10, 10);
        Circle circle = new Circle( "Red" ,10);
        Circle circle1 = new Circle("Black", 5);
        Square square = new Square("Yellow", 10);

        Shape[] shapes = {rectangle, rectangle1, circle, circle1, square};
        printTotal(shapes);
    }

    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;
        for (Shape i: shapes){
            totalArea += i.calculateArea();
            totalPerimeter += i.calculatePerimeter();
        }
        System.out.println("Total area is: " + totalArea);
        System.out.println("Total perimeter is: " + totalPerimeter);
    }
}
