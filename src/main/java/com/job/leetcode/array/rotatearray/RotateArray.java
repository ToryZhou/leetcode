package com.job.leetcode.array.rotatearray;

/**
 * Auther: toryzhou
 * Date: 7/6/18 19:40
 * https://leetcode-cn.com/problems/rotate-array/description/
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int size = nums.length;
        for (int time = 0; time < k; time++) {
            int temp = nums[size - 1];
            System.arraycopy(nums, 0, nums, 1, size - 1);
            nums[0] = temp;
        }
    }

}
