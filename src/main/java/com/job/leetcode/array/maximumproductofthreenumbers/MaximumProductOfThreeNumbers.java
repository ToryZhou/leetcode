package com.job.leetcode.array.maximumproductofthreenumbers;

/**
 * https://leetcode-cn.com/problems/maximum-product-of-three-numbers/description/
 */
public class MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        int first, second, third;
        first = Math.max(nums[0], nums[1]);
        second = Math.min(nums[0], nums[1]);
        third = nums[2];
        int negativeFirst = 0;
        int negativeSecond = 0;
        if (nums[2] >= first) {
            third = second;
            second = first;
            first = nums[2];
        } else if (nums[2] >= second) {
            third = second;
            second = nums[2];
        }
        for (int i = 3; i < nums.length; i++) {
            if (nums[i] >= first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] >= second) {
                third = second;
                second = nums[i];
            } else if (nums[i] >= third) {
                third = nums[i];
            }
        }

        for (int num : nums) {
            if (num <= negativeFirst) {
                negativeSecond = negativeFirst;
                negativeFirst = num;
            } else if (num <= negativeSecond) {
                negativeSecond = num;
            }
        }
        int result;
        if (negativeFirst * negativeSecond > second * third) {
            result = first * negativeFirst * negativeSecond;
        } else {
            result = first * second * third;
        }
        return result;
    }
}
