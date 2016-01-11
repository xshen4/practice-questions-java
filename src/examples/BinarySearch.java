package examples;

import java.util.Arrays;

/**
 * Binary search: 
 * Given a sorted array, check the element at the middle index of the array. 
 * If it's larger than the target integer, search the top half of the array.
 * If it's smaller than the target integer, search the bottom half of the array.
 * @author xiuli.shen
 *
 */
public class BinarySearch {

  public static void main(String [] args) {
    //int arr = (int)(Math.random()*0+9);
    int [] arr = {3,4,5,6,7,2,10};
    int target1 = 10;
    Arrays.sort(arr);
    System.out.println(binarySearch(arr, target1, 0, arr.length -1));
  }
  
  /**
   * Bugs fixed:
   * - Didn't pay special attention to the mid. Next time actually calculate what you're doing.
   * - Pay attention to which side of the array to search.
   * @param arr
   * @param target
   * @param startIdx
   * @param endIdx
   * @return
   */
  public static boolean binarySearch(int [] arr, int target, int startIdx, int endIdx) {
    int midIdx = (startIdx + endIdx) / 2;
    if (endIdx < startIdx) {
      return false;
    }
    if (arr[midIdx] == target) {
      return true;
    }
    else if (arr[midIdx] < target) {
      return binarySearch(arr, target, midIdx + 1, endIdx);
    }
    else {
      return binarySearch(arr, target, startIdx, midIdx - 1);
    } 
  }
  
}
