package com.job.leetcode.romantointeger;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void test() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assert.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
        Assert.assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }
}
