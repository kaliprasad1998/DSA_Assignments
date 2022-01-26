package org.java101;

// https://leetcode.com/problems/sqrtx/
public class SquareRoot {
    public static void main(String[] args) {
        int a = 26;
        int out = mySqrt(a);
        System.out.println(out);
    }

    public static int mySqrt(int x) {
        double i = 1;
        double square = i * i;
        while (square <= x) {
            i += 1;
            square = i * i;
        }
        return (int) i - 1;
    }
}
