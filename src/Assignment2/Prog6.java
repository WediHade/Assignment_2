package Assignment2;

public class Prog6 {
    public static void main(String[] args) {
        int[] ints = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int result = minimumOfInts(ints);
        System.out.println("The minimum element in the array is: " + result);
    }
    public static int minimumOfInts(int[] ints) {
        int temp;
        for (int i = 0; i < ints.length; i++){
            for (int j =  i + 1; j < ints.length; j++){
                if (ints[i] > ints[j]){
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints[0];
    }
}
