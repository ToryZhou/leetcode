package com.job.leetcode.dynamicprogramming.arithmeticslices;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author : toryzhou
 * @date: 9/24/18 21:28
 */
public class ArithmeticSlicesTest {


    @Test
    public void test() {
        ArithmeticSlices arithmeticSlices = new ArithmeticSlices();
        Assert.assertEquals(3, arithmeticSlices.numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }
}
