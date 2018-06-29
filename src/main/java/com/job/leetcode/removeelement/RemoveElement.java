package com.job.leetcode.removeelement;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; ) {
            if (val == nums[i]) {
                length--;
                System.arraycopy(nums, i + 1, nums, i, length - i);
            } else {
                i++;
            }
        }
        return length;
    }
}
