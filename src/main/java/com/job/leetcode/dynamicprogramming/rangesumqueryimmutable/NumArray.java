package com.job.leetcode.dynamicprogramming.rangesumqueryimmutable;

/**
 * https://leetcode-cn.com/problems/range-sum-query-immutable/description/
 */
public class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int result = 0;
        for (int n = i; n <= j; n++) {
            result += nums[n];
        }
        return result;
    }
}
