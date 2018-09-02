package com.job.leetcode.weeklycontest100;

import org.junit.Assert;
import org.junit.Test;

public class MonotonicTest {

    @Test
    public void test() {
        Monotonic monotonic = new Monotonic();
        Assert.assertTrue(monotonic.isMonotonic(new int[]{6, 5, 4, 4}));
        Assert.assertTrue(monotonic.isMonotonic(new int[]{11,11,9,4,3,3,3,1,-1,-1,3,3,3,5,5,5}));
    }
}
