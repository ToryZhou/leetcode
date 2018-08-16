package com.job.leetcode.array.pascalstriangleii;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PascalsTriangleIITest {

    @Test
    public void test() {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        Assert.assertEquals(Arrays.asList(1, 2, 1), pascalsTriangleII.getRow(2));
        Assert.assertEquals(Arrays.asList(1, 3, 3, 1), pascalsTriangleII.getRow(3));

    }
}
