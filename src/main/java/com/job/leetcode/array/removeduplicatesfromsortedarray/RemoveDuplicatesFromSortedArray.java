package com.job.leetcode.array.removeduplicatesfromsortedarray;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length - 1; ) {
            if (nums[i] == nums[i + 1]) {
                System.arraycopy(nums, i + 1, nums, i, length - 1 - i);
                length--;
            } else {
                i++;
            }
        }
        return length;
    }

}
