package com.job.leetcode.largestnumber;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (isBigger(nums[i], nums[j])) {
                    nums[j] = nums[i] + nums[j];
                    nums[i] = nums[j] - nums[i];
                    nums[j] = nums[j] - nums[i];
                }
            }
        }
        if (nums[0] == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        return sb.toString();
    }

    private boolean isBigger(int a, int b) {
        return Double.valueOf(String.valueOf(b)+String.valueOf(a))>Double.valueOf(String.valueOf(a)+String.valueOf(b));
    }
}
