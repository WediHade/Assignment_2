package Assignment5.problem1;

public class Square extends Rectangle {
    String color;
    double side;

    Square(String color, double side){
        super(color, side, side);
        this.color = color;
        this.side = side;
    }
}
