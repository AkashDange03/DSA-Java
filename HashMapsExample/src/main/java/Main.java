import java.util.*;

public class Main {

  public static void main(String[] args) {
    // HashMap<Integer, Integer> map1 = new HashMap<>();
    int[] arr = {11, 13, 3 ,14, 17, 3 ,7 ,9, 1, 11, 9, 15, 5, 2, 2, 3, };
    // int n = 6;
    // int x = 4;
    int temp[] = getFrequencies(arr);
    System.out.print(Arrays.toString(temp));
    // for (int ele : arr) {
    // if (map1.containsKey(ele)) {
    // map1.put(ele, map1.get(ele) + 1);
    // } else {
    // map1.put(ele, 1);
    // }
    // }

    // for (HashMap.Entry<Integer, Integer> e : map1.entrySet()) {
    // System.out.println(e.getKey() + ":"+ e.getValue());
    // }
    // }
  }

  public static int[] getFrequencies(int[] v) {
    // Write Your Code Here
    HashMap<Integer, Integer> map1 = new HashMap<>();
    int temp[] = new int[2]; // temp array of int type to store occurance

    // iterate over each element of nums array
    for (int ele : v) {
      // if element is in range of 1 to n then only make entry in hashmap
      // if (ele <= n) {
      // if ele present increament count by 1
      if (map1.containsKey(ele)) {
        map1.put(ele, map1.get(ele) + 1);
      } else {
        // if not then make new entry
        map1.put(ele, 1);
      }
      // }

    }

    int i = 0;
    for (HashMap.Entry<Integer, Integer> e : map1.entrySet()) {
      // add element into temp array while iterating
      System.out.println(e.getKey() + ":"+ e.getValue());
      if(i!=2){
         temp[i]=e.getKey();
        i++;
      }

      if(map1.get(temp[0])==map1.get(temp[1])){
        temp[1]=temp[0];
      }
    }
    return temp;

  }

  public static int[] countFrequency(int n, int x, int nums[]) {

    // create a hashmap to store count of ele
    HashMap<Integer, Integer> map1 = new HashMap<>();
    int temp[] = new int[6]; // temp array of int type to store occurance

    // iterate over each element of nums array
    for (int ele : nums) {
      // if element is in range of 1 to n then only make entry in hashmap
      // if (ele <= n) {
      // if ele present increament count by 1
      if (map1.containsKey(ele)) {
        map1.put(ele, map1.get(ele) + 1);
      } else {
        // if not then make new entry
        map1.put(ele, 1);
      }
      // }

    }

    int i = 0;
    for (HashMap.Entry<Integer, Integer> e : map1.entrySet()) {
      // add element into temp array while iterating
      if(i!=2){
        temp[i] = e.getValue();
        i++;
      }
     
    }
    return temp;
  }

}