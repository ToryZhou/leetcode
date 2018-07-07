package com.job.leetcode.array.removeduplicatesfromsortedarray;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        Assert.assertEquals(2, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2}));
        Assert.assertEquals(5, removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
