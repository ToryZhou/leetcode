package com.job.leetcode.array.transposematrix;

/**
 * https://leetcode-cn.com/problems/transpose-matrix/description/
 */
public class TransposeMatrix {

    public int[][] transpose(int[][] A) {
        int x = A.length;
        int y = A[0].length;
        int[][] result = new int[y][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}
