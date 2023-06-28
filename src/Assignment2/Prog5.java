package Assignment2;

import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};

        int[] result = combine(a, b);
        for (int i:result){
            System.out.print(i + " ");
        }
    }

    public static int[] combine(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        System.arraycopy(b, 0, temp, a.length, b.length);
        return temp;
    }
}
