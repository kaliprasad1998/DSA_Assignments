package org.java101;

// https://leetcode.com/problems/valid-perfect-square/
public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(17));
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = findSqrt(num);
        if (sqrt * sqrt == num) {
            return true;
        }
        return false;
    }

    public static int findSqrt(int n) {
        double i = 1;
        double square = 1 * 1;

        while (square <= n) {
            i += 1;
            square = i * i;
        }
        return (int) i - 1;
    }
}
