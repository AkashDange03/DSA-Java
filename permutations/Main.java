// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;
class Main {
  public static void main(String[] args) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> p = new ArrayList<>();
    permutations(p,new int[]{1,2,3},ans);
    System.out.println(ans);
    // permutations("", "abc");
  }

  static void permutations(List<Integer> p, int[] up,List<List<Integer>> ans) {
    if (up.length == 0) {
      ans.add(p);
      return;
    }
    int digit = up[0];
    for (int i = 0; i <= p.size(); i++) {
      List<Integer> ls = new ArrayList<>(p);  // Create a new list to avoid modifying the original list
      ls.add(i, digit);
      permutations(ls, Arrays.copyOfRange(up, 1, up.length),ans);
    }
  }

  // static void permutations(String p, String up) {
  //   if (up.isEmpty()) {
  //     System.out.println(p);
  //     return;
  //   }
  //   char ch = up.charAt(0);

  //   for (int i = 0; i <= p.length(); i++) {
  //     String f = p.substring(0, i);
  //     String s = p.substring(i, p.length());
  //     permutations(f + ch + s, up.substring(1));
  //   }
  // }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}