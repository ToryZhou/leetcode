package com.job.leetcode.array.onebitandtwobitcharacters;

/**
 * https://leetcode-cn.com/problems/1-bit-and-2-bit-characters/description/
 */
public class OneBitAndTwoBitCharacters {

    public boolean isOneBitCharacter(int[] bits) {
        //todo
        if (bits.length <= 1) {
            return true;
        }
        return bits[bits.length - 1] == 0 && bits[bits.length - 2] == 0;
    }
}
