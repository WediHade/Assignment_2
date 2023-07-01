package Assignment4;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 125;
        reverseInt(n);
    }
    public static void reverseInt(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num % 10);
        reverseInt(num / 10);
    }
}
