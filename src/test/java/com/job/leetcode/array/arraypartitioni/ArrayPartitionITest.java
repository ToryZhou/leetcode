package com.job.leetcode.array.arraypartitioni;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartitionITest {

    @Test
    public void test() {
        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
        Assert.assertEquals(4, arrayPartitionI.arrayPairSum(new int[]{1, 4, 3, 2}));
    }
}
