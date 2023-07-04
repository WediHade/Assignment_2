package Assignment5.Problem3;

import java.util.Arrays;

public class FigureMain {
    public static void main(String[] args) {
        DownwardHat down = new DownwardHat();
        UpwardHat up = new UpwardHat();
        FaceMaker face = new FaceMaker();
        Vertical ver = new Vertical();

        Figure[] figure = {up, up, down,face, ver};
        for(Figure f: figure) {
            f.getFigure();
        }
        System.out.println();
        System.out.println("Printing the Objects with their class name");
        for (Figure f: figure) {
            System.out.print(f.getClass().getSimpleName() + ":");
            f.getFigure();
            System.out.println();
        }
    }
}
