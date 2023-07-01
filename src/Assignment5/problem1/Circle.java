package Assignment5.problem1;

import static java.lang.Math.PI;

public class Circle extends Shape {
     double radius;
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double calculateArea() {
        return PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 0.0;
    }
}
