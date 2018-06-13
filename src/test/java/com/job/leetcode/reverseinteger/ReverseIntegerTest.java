package com.job.leetcode.reverseinteger;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void test() {
        ReverseInteger reverseInteger = new ReverseInteger();
        Assert.assertEquals(-21, reverseInteger.reverse(-12));
        Assert.assertEquals(21, reverseInteger.reverse(12));
        Assert.assertEquals(321, reverseInteger.reverse(123));
        Assert.assertEquals(-321, reverseInteger.reverse(-123));
        Assert.assertEquals(-21, reverseInteger.reverse(-120));
    }
}
