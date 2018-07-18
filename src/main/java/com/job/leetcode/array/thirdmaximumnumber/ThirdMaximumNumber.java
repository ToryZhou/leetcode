package com.job.leetcode.array.thirdmaximumnumber;

/**
 * https://leetcode-cn.com/problems/third-maximum-number/description/
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        int biggest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int times = 0;
        boolean isMin = false;
        for (int i : nums) {
            if (i > biggest) {
                third = second;
                second = biggest;
                biggest = i;
                times++;
                continue;
            }
            if (i > second && i != biggest) {
                third = second;
                second = i;
                times++;
                continue;
            }
            if (i >= third && i != biggest && i != second) {
                third = i;
                times++;
                continue;
            }
            if (i == Integer.MIN_VALUE && !isMin) {
                times++;
                isMin = true;
            }
        }
        return times > 2 ? third : biggest;
    }
}
