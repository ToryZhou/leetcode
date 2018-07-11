package com.job.leetcode.array.maximumsubarray;

/**
 * https://leetcode-cn.com/problems/maximum-subarray/description/
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        //todo
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (result + nums[i] > result) {
                result = result + nums[i];
            }
        }
        return result;
    }
}
