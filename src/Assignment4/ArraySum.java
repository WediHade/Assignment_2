package Assignment4;

public class ArraySum {
  public static int sum(int[] arr, int n){
      if (n == 1)
          return arr[0];
      return arr[n - 1] + sum(arr, n - 1);
  }
  public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = sum(arr, arr.length);
        System.out.println(result);
    }
}
