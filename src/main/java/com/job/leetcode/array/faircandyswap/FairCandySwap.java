package com.job.leetcode.array.faircandyswap;

/**
 * Auther: toryzhou
 * Date: 8/24/18 12:35
 * https://leetcode-cn.com/problems/fair-candy-swap/description/
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        int totalA = 0;
        for (int aA : A) {
            totalA += aA;
        }
        int totalB = 0;
        for (int bB : B) {
            totalB += bB;
        }
        int diff = totalB - totalA;
        for (int aA : A) {
            for (int aB : B) {
                if (aB * 2 - aA * 2 == diff) {
                    return new int[]{aA, aB};
                }
            }
        }
        return null;
    }
}
