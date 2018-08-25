package com.job.leetcode.array.containsduplicateii;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateIITest {

    @Test
    public void test() {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        Assert.assertTrue(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
}
