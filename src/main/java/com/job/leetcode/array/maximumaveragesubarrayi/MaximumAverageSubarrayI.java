package com.job.leetcode.array.maximumaveragesubarrayi;

/**
 * Auther: toryzhou
 * Date: 8/21/18 20:03
 * https://leetcode-cn.com/problems/maximum-average-subarray-i/description/
 */
public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < 1) {
            return -1;
        }
        int sum = 0;
        double max = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];// 先求前k个数的和，之后不断维护这个数组即可。
            max = sum;
        }
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > max) {
                max = sum;
            }
        }
        return max / k;
    }

    public double findMaxAverageSlow(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - k + 1; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += nums[j];
            }
            if (1.0 * temp / k > max) {
                max = 1.0 * temp / k;
            }
        }
        return max;
    }
}
