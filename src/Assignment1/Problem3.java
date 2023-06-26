package Assignment1;

public class Problem3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 2_000_000_000;
        int range = max - min;
        int number =  min + (int)(Math.random() * (range + 1));

        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
            System.out.println("Use Byte to store " + number);
        }
        else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
            System.out.println("Use Short to store " + number);
        }
        else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            System.out.println("Use Integer to store " + number);
        }
        else if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
            System.out.println("Use Long to store " + number);
        }
        else {
            System.out.println("Number is too large to be stored in the given primitive data types.");
        }
        //this comment
        //keepp
    }

}
