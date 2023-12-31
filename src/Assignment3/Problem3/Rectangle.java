package Assignment3.Problem3;

final public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double computeArea() {
        return width * height;
    }
}
