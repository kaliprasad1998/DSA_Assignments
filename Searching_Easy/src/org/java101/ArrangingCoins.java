package org.java101;

// https://leetcode.com/problems/arranging-coins/
public class ArrangingCoins {
    public static void main(String[] args) {
        int out = arrangeCoins(1804289383); // edge case of leet code
        System.out.println(out);
    }

    public static int arrangeCoins(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            double sumOfNums = sum(mid);
            if (sumOfNums < n) {
                start = mid + 1;
            } else if (sumOfNums > n) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start - 1;

    }

    public static double sum(double n) {
        return (n * (n + 1)) / 2;
    }


}
