package com.job.leetcode.weeklycontest100;

/**
 * https://leetcode-cn.com/contest/weekly-contest-100/problems/monotonic-array/
 */
public class Monotonic {

    public boolean isMonotonic(int[] A) {
        // todo
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] >= A[i - 1] != A[i + 1] >= A[i] && A[i] != A[i - 1] & A[i + 1] != A[i]) {
                return false;
            }
        }
        return true;
    }
}
