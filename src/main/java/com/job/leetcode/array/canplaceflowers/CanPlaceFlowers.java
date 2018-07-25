package com.job.leetcode.array.canplaceflowers;


/**
 * https://leetcode-cn.com/problems/can-place-flowers/description/
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max = 0;
        int number = 1;
        boolean end;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                number++;
                end = false;
            } else {
                end = true;
            }
            if (i == flowerbed.length - 1 && !end) {
                number++;
                end = true;
            }
            if (end && number >= 1) {
                max += (number - 1) / 2;
                number = 0;
            }
        }
        return max >= n;
    }
}
