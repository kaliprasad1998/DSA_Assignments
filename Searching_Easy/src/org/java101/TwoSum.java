package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 9, 56, 90};
        int[] out = twoSum(nums, 8);
        System.out.println(Arrays.toString(out));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] out = {-1, -1};
        for (int i = 0; i < numbers.length; i++) {
            out[0] = i;
            int res = BS(numbers, target - numbers[i], i + 1, numbers.length - 1);
            if (res != -1) {
                out[1] = res + 1;
                out[0] = out[0] + 1;
                return out;
            }
            out[0] = -1;
        }
        return out;
    }

    public static int BS(int[] arr, int targetNum, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < targetNum) {
                start = mid + 1;
            } else if (arr[mid] > targetNum) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
