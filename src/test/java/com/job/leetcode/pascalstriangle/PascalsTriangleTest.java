package com.job.leetcode.pascalstriangle;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class PascalsTriangleTest {

    @Test
    public void test() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        Assert.assertEquals(Arrays.asList(Collections.singletonList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1)), pascalsTriangle.generate(3));
        Assert.assertEquals(Collections.emptyList(), pascalsTriangle.generate(0));
    }
}
