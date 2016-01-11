package examples;

/**
 * Given an array, calculate and set the minimum and the maximum.
 * @author xiuli.shen
 *
 */
public class SetMinAndMax {

  public static void main(String [] args) {
    int [] arr = {3,4,5,6,7,2,10};
    setMinAndMax(arr);
    setMinAndMax2(arr);
  }
  
  /**
   * Time complexity: O(n)
   * Space complexity: O(2n) = O(1)
   * @param arr
   */
  public static void setMinAndMax(int [] arr) {
    int length = arr.length;
    if(length < 0) {
      System.out.println("Empty Array.");
    }
    int min = arr[0], max = arr[0];
    for (int i = 1; i < length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
  
  /**
   * Time complexity: O(2n) = O(n)
   * Space complexity: O(2(1)) = O(1)
   * @param arr
   */
  public static void setMinAndMax2(int [] arr) {
    int length = arr.length;
    if (length < 0) {
      System.out.println("Empty Array.");
    }
    int min = arr[0], max = arr[0];
    for (int i = 0; i < length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    for (int j = 0; j < length; j++) {
      if (arr[j] > max) {
        max = arr[j];
      }
    }
    
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
  }
  
}
