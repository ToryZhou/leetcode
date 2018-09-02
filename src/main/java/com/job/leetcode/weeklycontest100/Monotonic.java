package com.job.leetcode.weeklycontest100;

/**
 * https://leetcode-cn.com/contest/weekly-contest-100/problems/monotonic-array/
 */
public class Monotonic {

    public boolean isMonotonic(int[] A) {
        Boolean bigger = false;
        Boolean decided = false;
        for (int i = 0; i < A.length - 1; i++) {
            if (!decided && A[i] != A[i + 1]) {
                decided = true;
                bigger = A[i + 1] > A[i];
            }
            if (decided && A[i + 1] != A[i] && A[i + 1] > A[i] != bigger) {
                return false;
            }
        }
        return true;
    }
}
