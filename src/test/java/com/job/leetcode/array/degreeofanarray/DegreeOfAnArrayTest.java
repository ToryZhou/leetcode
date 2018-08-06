package com.job.leetcode.array.degreeofanarray;


import org.junit.Assert;
import org.junit.Test;

public class DegreeOfAnArrayTest {

    @Test
    public void test() {
        DegreeOfAnArray degreeOfAnArray = new DegreeOfAnArray();
        Assert.assertEquals(2, degreeOfAnArray.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }
}
