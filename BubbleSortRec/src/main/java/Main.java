// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Arrays;
public class Main {
  private static void bubbleSort(int[] arr, int row, int col){
    if(row==0){
      return; 
    }
    if(col<row){
      if(arr[col]>arr[col+1]){
        int temp=arr[col];
        arr[col]=arr[col+1];
        arr[col+1]=temp;
      }
      bubbleSort(arr,row,col+1);
    }else{
      bubbleSort(arr,row-1,0);
    }
  }

  private static void insertionSort(int[] arr, int row, int col){
    if(row==0){
      return; 
    }
    if(col>0){
      if(arr[col]<arr[col-1]){
        int temp=arr[col];
        arr[col]=arr[col-1];
        arr[col-1]=temp;
      }
      insertionSort(arr,row,col-1);
    }else{
      insertionSort(arr,row-1,arr.length-row+1);
    }
  }
  
  public static void main(String[] args) {
   int[] arr={5,1,3,2,0};
    insertionSort(arr,arr.length-1, 1);
    System.out.print(Arrays.toString(arr));
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}