package Assignment4;

public class Count {
    public static void main(String[] args) {
        int n = 12356789;
        int result = count(n);
        System.out.println(result);
    }

    public static int count(int num) {
        if (num / 10 == 0)
            return 1;
        return 1 + count(num / 10);
    }
}
