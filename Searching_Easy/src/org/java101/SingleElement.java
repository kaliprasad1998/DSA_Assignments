package org.java101;

// https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElement {

  public static void main(String[] args) {
    int[] arr = {2, 2, 3, 3, 7, 7, 11};
    int out = singleNonDuplicate(arr);
    System.out.println(out);
  }

  public static int singleNonDuplicate(int[] nums) {
    int out = -1;
    int start = 0;
    int end = nums.length - 1;

    if (nums.length == 1) {
      return nums[0];
    }

    while (nums[start] == nums[start + 1] && nums[end] == nums[end - 1]) {
      start = start + 2;
      end = end - 2;
    }
    if (nums[start] != nums[start + 1]) {
      return nums[start];
    } else if (nums[end - 1] != nums[end]) {
      return nums[end];
    }
    return out;
  }
}
