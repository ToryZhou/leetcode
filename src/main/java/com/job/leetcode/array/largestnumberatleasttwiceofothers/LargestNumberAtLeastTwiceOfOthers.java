package com.job.leetcode.array.largestnumberatleasttwiceofothers;

/**
 * https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/description/
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int biggest = 0, second = 0, position = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggest) {
                second = biggest;
                biggest = nums[i];
                position = i;
            } else if (nums[i] > second) {
                second = nums[i];
            }
        }
        return biggest >= second * 2 ? position : -1;
    }
}
