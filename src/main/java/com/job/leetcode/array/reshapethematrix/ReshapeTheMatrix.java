package com.job.leetcode.array.reshapethematrix;

/**
 * Auther: toryzhou
 * Date: 8/3/18 09:35
 * https://leetcode-cn.com/problems/reshape-the-matrix/description/
 */
public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[][] ints = new int[r][c];
        // todo
        return ints;
    }
}
