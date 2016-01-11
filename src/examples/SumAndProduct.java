package examples;

public class SumAndProduct {

  public static void main(String [] args) {
    int [] arr = {3,4,5,6,7,2,10};
    printSumAndProduct(arr);
  }
  
  /**
   * Time complexity: O(2n) = O(n);
   * Space complexity: O(1)
   * @param arr
   */
  public static void printSumAndProduct (int [] arr) {
    int length = arr.length;
    int sum = 0,
        product = arr.length > 1 ? arr[0] : 0;
    // Get sum
    for (int i = 0; i < length; i++) {
      sum += arr[i];
    }
    // Get product
    for (int i = 1; i < length; i++) {
      product *= arr[i];
    }
    
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);
  }
  
}
