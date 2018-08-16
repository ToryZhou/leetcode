package com.job.leetcode.array.largestnumberatleasttwiceofothers;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberAtLeastTwiceOfOthersTest {

    @Test
    public void test() {
        LargestNumberAtLeastTwiceOfOthers largestNumberAtLeastTwiceOfOthers = new LargestNumberAtLeastTwiceOfOthers();
        Assert.assertEquals(1, largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{3, 6, 1, 0}));
        Assert.assertEquals(-1, largestNumberAtLeastTwiceOfOthers.dominantIndex(new int[]{1, 2, 3, 4}));
    }
}
