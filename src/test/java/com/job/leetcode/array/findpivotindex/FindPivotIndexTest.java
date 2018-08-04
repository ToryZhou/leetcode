package com.job.leetcode.array.findpivotindex;

import org.junit.Assert;
import org.junit.Test;

public class FindPivotIndexTest {

    @Test
    public void test() {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        Assert.assertEquals(3, findPivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        Assert.assertEquals(0, findPivotIndex.pivotIndex(new int[]{-1, -1, -1, 0, 1, 1}));
    }
}
