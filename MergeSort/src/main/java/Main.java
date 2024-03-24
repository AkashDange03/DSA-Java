// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;
public class Main {
  private static  void mergeSort(int[] arr, int low ,int high){
    if(low>=high){
      return;
    }
    int mid=low+(high-low)/2;
    mergeSort(arr, low,mid); //left part
    mergeSort(arr,mid+1,high); //right part
    merge(arr,low,mid,high); // perform merge of two halves
  }

  private static void merge(int[] arr ,int low, int mid , int high){
    ArrayList<Integer> temp = new ArrayList<Integer>();
    int left=low;
    int right=mid+1;
    while(left<=mid && right<=high){
      if(arr[left]<arr[right]){
        temp.add(arr[left]);
        left++;
      }else{
        temp.add(arr[right]);
        right++;
      }
    }
    while(left<=mid){
      temp.add(arr[left]);
      left++;
    }

    while(right<=high){
      temp.add(arr[right]);
      right++;
    }

    for(int i=low; i<=high; i++){
      arr[i]=temp.get(i-low);
    }
    
  }
  public static void main(String[] args) {
    int[] arr={5,3,6,1,9,19};
    mergeSort(arr,0,arr.length-1);
    System.out.print(Arrays.toString(arr));
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}