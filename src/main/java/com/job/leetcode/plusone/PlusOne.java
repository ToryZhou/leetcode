package com.job.leetcode.plusone;

/**
 * https://leetcode-cn.com/problems/plus-one/
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                break;
            }
        }
        if (digits[0] == 0) {
            int[] ints = new int[digits.length + 1];
            ints[0] = 1;
            System.arraycopy(digits, 0, ints, 1, digits.length);
            return ints;
        } else {
            return digits;
        }
    }
}
