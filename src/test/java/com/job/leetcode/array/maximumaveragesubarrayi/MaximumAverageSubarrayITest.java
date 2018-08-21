package com.job.leetcode.array.maximumaveragesubarrayi;

import org.junit.Assert;
import org.junit.Test;

/**
 * Auther: toryzhou
 * Date: 8/21/18 20:07
 */
public class MaximumAverageSubarrayITest {

    @Test
    public void test() {
        MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();
        Assert.assertEquals(12.75, maximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4), 2);
        Assert.assertEquals(5, maximumAverageSubarrayI.findMaxAverage(new int[]{5}, 1), 2);
        Assert.assertEquals(-1.0, maximumAverageSubarrayI.findMaxAverage(new int[]{-1}, 1), 2);
    }
}
