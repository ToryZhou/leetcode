package com.job.leetcode.array.canplaceflowers;

import org.junit.Assert;
import org.junit.Test;

public class CanPlaceFlowersTest {

    @Test
    public void test() {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
//        Assert.assertTrue(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
//        Assert.assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        Assert.assertFalse(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }
}
