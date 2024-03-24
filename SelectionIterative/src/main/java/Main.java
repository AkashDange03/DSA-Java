import java.util.*;
public class Main {
  public static void main(String[] args) {
    int[] arr = { 0, 4, 3, 2, 1 };
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int end = arr.length - i - 1;
      int max = getMax(0, end, arr);
      swap(arr,max,end);
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void swap(int[] arr, int max, int end){
    int temp = arr[max];
    arr[max] = arr[end];
    arr[end] = temp;
  }

  public static int getMax(int start, int end, int[] arr) {
    int max = 0;
    for (int i = 1; i <= end; i++) {
      if (arr[i] > arr[max]) {
        max = i;
      }
    }
    return max;
  }

}