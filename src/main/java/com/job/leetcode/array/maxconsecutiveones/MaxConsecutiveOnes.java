package com.job.leetcode.array.maxconsecutiveones;

/**
 * https://leetcode-cn.com/problems/max-consecutive-ones/description/
 */
public class MaxConsecutiveOnes {


    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;
        for (int num : nums) {
            if (num == 1) {
                temp++;
            } else {
                temp = 0;
            }
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }
}
