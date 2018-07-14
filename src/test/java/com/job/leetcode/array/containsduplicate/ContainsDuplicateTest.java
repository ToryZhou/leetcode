package com.job.leetcode.array.containsduplicate;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void test() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        Assert.assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));

    }
}
