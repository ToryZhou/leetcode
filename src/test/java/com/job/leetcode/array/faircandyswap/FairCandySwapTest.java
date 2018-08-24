package com.job.leetcode.array.faircandyswap;

import org.junit.Assert;
import org.junit.Test;

public class FairCandySwapTest {

    @Test
    public void test() {
        FairCandySwap fairCandySwap = new FairCandySwap();
        Assert.assertArrayEquals(new int[]{1, 2}, fairCandySwap.fairCandySwap(new int[]{1, 2}, new int[]{2, 3}));
    }
}
