package Assignment2;

import java.util.Random;

import static java.lang.Math.PI;

public class Prog1 {
    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1, 9);
        int y = RandomNumbers.getRandomInt(3, 14);

        System.out.println("The power of π to x is: " + Math.pow(PI, x));
        System.out.println("The power of y to π is: " + Math.pow(y, PI));
    }

}
