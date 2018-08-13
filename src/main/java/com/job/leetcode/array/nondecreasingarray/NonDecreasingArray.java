package com.job.leetcode.array.nondecreasingarray;

/**
 * https://leetcode-cn.com/problems/non-decreasing-array/description/
 */
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {

        // todo
        boolean first = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (j != i && j + 1 != i) {
                    if (nums[j] > nums[j + 1]) {
                        if (first) {
                            return false;
                        } else {
                            first = true;
                        }

                    }
                }
            }
        }
        return true;
    }

}
