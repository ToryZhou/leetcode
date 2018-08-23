package com.job.leetcode.array.longestcontinuousincreasingsubsequence;

import org.junit.Assert;
import org.junit.Test;

/**
 * Auther: toryzhou
 * Date: 8/23/18 12:36
 */
public class LongContinuousIncreasingSubsequenceTest {

    @Test
    public void test() {
        LongContinuousIncreasingSubsequence longContinuousIncreasingSubsequence = new LongContinuousIncreasingSubsequence();
        Assert.assertEquals(3, longContinuousIncreasingSubsequence.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
        Assert.assertEquals(4, longContinuousIncreasingSubsequence.findLengthOfLCIS(new int[]{1, 3, 5, 7}));
        Assert.assertEquals(0, longContinuousIncreasingSubsequence.findLengthOfLCIS(new int[]{}));

    }

}
