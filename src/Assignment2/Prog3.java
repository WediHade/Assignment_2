package Assignment2;

import java.util.Arrays;
import java.util.Objects;

public class Prog3 {
    public static void main(String[] args) {

        String[] animals = {"horse", "dog", "cat", "horse", "dog"};
        String[] newAnimal = new String[animals.length];

        int indexCount = 0;

        for (int i = 0; i < animals.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < animals.length; j++) {
                //checks if it's a duplicate
                if (Objects.equals(newAnimal[j], animals[i])) {
                    isDuplicate = true;
                    break;
                }
            }
            // add it if it's not duplicate
            if (!isDuplicate) {
                newAnimal[indexCount] = animals[i];
                indexCount++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(newAnimal, indexCount)));
    }
}
