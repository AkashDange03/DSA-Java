import java.util.*;
public class Main {
  public static void main(String[] args) {
    int[] arr={5,3,2,1,4};
    for(int i=0; i<=arr.length-1;){
      int correctIndex=arr[i]-1;
      if( arr[i]<arr.length && arr[i]!=arr[correctIndex] ){
        int temp=arr[i];
        arr[i]=arr[correctIndex];
        arr[correctIndex]=temp;
      }else{
        i++;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}