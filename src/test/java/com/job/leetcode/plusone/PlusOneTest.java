package com.job.leetcode.plusone;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    @Test
    public void test() {
        PlusOne plusOne = new PlusOne();
        Assert.assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));

        Assert.assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
    }
}
