package com.job.leetcode.array.thirdmaximumnumber;

import org.junit.Assert;
import org.junit.Test;

public class ThirdMaximumNumberTest {
    @Test
    public void test() {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        Assert.assertEquals(1, thirdMaximumNumber.thirdMax(new int[]{3, 2, 1}));
        Assert.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 2}));
        Assert.assertEquals(1, thirdMaximumNumber.thirdMax(new int[]{2, 2, 3, 1}));
        Assert.assertEquals(2, thirdMaximumNumber.thirdMax(new int[]{1, 2, 2, 5, 3, 5}));
        Assert.assertEquals(-2147483648, thirdMaximumNumber.thirdMax(new int[]{1, 2, -2147483648}));
        Assert.assertEquals(-2147483648, thirdMaximumNumber.thirdMax(new int[]{1, -2147483648, 2}));

    }
}
