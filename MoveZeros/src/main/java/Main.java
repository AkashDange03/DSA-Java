// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    int[] arr={0,1,2,0,3};
    //0,1,2,0,3
    //1,0,2,0,3
    //1,2,0,0,3
    //1,2,0,0,3
    //1,2,3,0,0
   int i,j=0;
    for(i=0; i<arr.length; i++){
      if(arr[i]!=0){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        j++;
      }
       System.out.println(Arrays.toString(arr));
    }
    System.out.println(Arrays.toString(arr));
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}