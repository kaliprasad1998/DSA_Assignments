package org.java101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

// https://leetcode.com/problems/intersection-of-two-arrays/
public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {2, 1};
        int[] nums2 = {1, 1};
        int[] out = intersection(nums1, nums2);
        System.out.println(Arrays.toString(out));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer num : set2) {
            if (set1.contains(num)) {
                list.add(num);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}

