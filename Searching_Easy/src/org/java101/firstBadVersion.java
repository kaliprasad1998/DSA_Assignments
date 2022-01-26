package org.java101;

// https://leetcode.com/problems/first-bad-version/
public class firstBadVersion {
    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid is a badversion
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
