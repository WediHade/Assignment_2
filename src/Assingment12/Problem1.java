package Assingment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the scores in the range of 0 to 100 non negative numbers");

        try {
            int score = scan.nextInt();
            //-System.out.println("You entered a correct data type and range " + score);

            if (score < 0 || score > 100) throw new UnsupportedOperationException("Score must be between 0 and 100");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter a valid integer value.");
        }
        catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
