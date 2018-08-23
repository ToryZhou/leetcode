package com.job.leetcode.array.longestcontinuousincreasingsubsequence;

/**
 * Auther: toryzhou
 * Date: 8/22/18 08:58
 * https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/description/
 */
public class LongContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int longest = 1;
        int temp = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                temp++;
            } else {
                if (temp > longest) {
                    longest = temp;
                }
                temp = 1;
            }
        }
        return longest > temp ? longest : temp;
    }
}
