// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// number of dice rolls with target sum

class Main {
  public static void main(String[] args) {
    dicePer("",4);
  }

  static void dicePer(String p , int target ){
    if(target==0){
      System.out.println(p);
      return;
    }
    for(int i=1; i<=6 && i<=target; i++){
      dicePer(p+i,target-i);
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}