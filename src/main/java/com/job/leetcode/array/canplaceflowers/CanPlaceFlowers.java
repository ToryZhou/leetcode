package com.job.leetcode.array.canplaceflowers;


/**
 * https://leetcode-cn.com/problems/can-place-flowers/description/
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // todo
        int max = 0;
        int number = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                number++;
            } else {
                number = 0;
            }
            max += (number - 1) / 2;

        }
        return max >= n;
    }
}
