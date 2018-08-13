package com.job.leetcode.array.nondecreasingarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Auther: toryzhou
 * Date: 8/13/18 20:58
 */
public class NonDecreasingArrayTest {

    @Test
    public void test() {
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
//        Assert.assertTrue(nonDecreasingArray.checkPossibility(new int[]{4, 2, 3}));
//        Assert.assertFalse(nonDecreasingArray.checkPossibility(new int[]{4, 2, 1}));
//        Assert.assertFalse(nonDecreasingArray.checkPossibility(new int[]{3, 4, 2, 3}));
        Assert.assertTrue(nonDecreasingArray.checkPossibility(new int[]{-1, 4, 2, 3}));

    }
}
