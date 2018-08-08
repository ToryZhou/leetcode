package com.job.leetcode.array.reshapethematrix;

import java.util.ArrayList;

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
        ArrayList<Integer> integers = new ArrayList<>();
        for (int[] item : nums) {
            for (int i : item) {
                integers.add(i);
            }
        }
        int[][] ints = new int[r][c];
        //todo
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(i);
                System.out.println(i * nums[0].length);
                System.out.println(j);
                ints[i][j] = integers.get(i * nums[0].length + j);
            }

        }
        return ints;
    }
}
