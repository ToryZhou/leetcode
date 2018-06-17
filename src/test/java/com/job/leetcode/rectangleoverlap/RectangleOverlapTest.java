package com.job.leetcode.rectangleoverlap;

import org.junit.Assert;
import org.junit.Test;

public class RectangleOverlapTest {

    @Test
    public void test() {
        RectangleOverlap rectangleOverlap = new RectangleOverlap();
        Assert.assertTrue(rectangleOverlap.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
        Assert.assertFalse(rectangleOverlap.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}));

        Assert.assertTrue(rectangleOverlap.isRectangleOverlap(new int[]{7, 8, 13, 15}, new int[]{10, 8, 12, 20}));
        Assert.assertTrue(rectangleOverlap.isRectangleOverlap(new int[]{2,17,6,20}, new int[]{3,8,6,20}));
    }
}
