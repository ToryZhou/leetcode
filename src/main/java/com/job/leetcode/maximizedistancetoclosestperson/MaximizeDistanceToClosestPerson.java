package com.job.leetcode.maximizedistancetoclosestperson;

/**
 * https://leetcode-cn.com/problems/maximize-distance-to-closest-person/description/
 */
public class MaximizeDistanceToClosestPerson {

    public int maxDistToClosest(int[] seats) {
        int max = 0;
        int temp = 0;
        boolean facingOne = false;
        for (int i = 0; i < seats.length; i++) {
            if (0 == seats[i]) {
                temp++;
            } else {
                facingOne = true;
                temp = 0;
            }
            if (temp > max && !facingOne) {
                max = temp;
                continue;
            }
            if ((temp + 1) / 2 > max) {
                max = (temp + 1) / 2;
            }
            if (temp > max && i == seats.length - 1) {
                max = temp;
            }
        }
        return max;
    }
}
