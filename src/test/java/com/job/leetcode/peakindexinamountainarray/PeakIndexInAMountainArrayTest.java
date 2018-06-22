package com.job.leetcode.peakindexinamountainarray;

import org.junit.Assert;
import org.junit.Test;

public class PeakIndexInAMountainArrayTest {

    @Test
    public void test() {
        PeakIndexInAMountainArray peakIndexInAMountainArray = new PeakIndexInAMountainArray();
        Assert.assertEquals(1, peakIndexInAMountainArray.peakIndexInMountainArray(new int[]{0, 1, 0}));
    }

}
