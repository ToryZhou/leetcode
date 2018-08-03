package com.job.leetcode.array.movezeroes;

/**
 * https://leetcode-cn.com/problems/move-zeroes/description/
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == 0) {
                size--;
                if (size <= i) {
                    return;
                }
                System.arraycopy(nums, i + 1, nums, i, nums.length - 1 - i);
                nums[nums.length - 1] = 0;
            } else {
                i++;
            }
        }
    }
}
