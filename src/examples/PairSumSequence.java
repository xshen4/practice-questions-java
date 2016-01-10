package examples;

public class PairSumSequence {
  
  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);
    System.out.println(pairSumSequence(n));
  }

  /**
   * @param n
   * @return
   */
  static int pairSumSequence(int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += sum(i, i + 1);
    }
    return sum;
  }
  
  static int sum(int a, int b) {
    return a + b;
  }
  
}
