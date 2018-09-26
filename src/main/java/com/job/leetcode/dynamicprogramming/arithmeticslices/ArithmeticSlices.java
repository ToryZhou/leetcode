package com.job.leetcode.dynamicprogramming.arithmeticslices;

/**
 * https://leetcode-cn.com/problems/arithmetic-slices/description/
 */
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i; j < A.length - 2; j++) {
                if (A[j + 2] - A[j + 1] == A[j + 1] - A[j]) {
                    result++;
                } else {
                    break;
                }
            }

        }
        return result;
    }
}
