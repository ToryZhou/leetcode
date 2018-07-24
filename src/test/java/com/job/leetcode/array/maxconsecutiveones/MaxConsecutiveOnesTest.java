package com.job.leetcode.array.maxconsecutiveones;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void test() {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        Assert.assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));

    }
}
