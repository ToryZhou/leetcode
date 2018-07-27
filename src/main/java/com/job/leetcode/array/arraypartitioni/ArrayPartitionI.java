package com.job.leetcode.array.arraypartitioni;

/**
 * Auther: toryzhou
 * Date: 7/27/18 09:22
 * https://leetcode-cn.com/problems/array-partition-i/description/
 */
public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {

        // todo take too long time
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    nums[j] = nums[i] + nums[j];
                    nums[i] = nums[j] - nums[i];
                    nums[j] = nums[j] - nums[i];
                }
            }

        }
        for (int i = 0; i < nums.length; i = i + 2) {
            result += nums[i];
        }
        return result;
    }
}
