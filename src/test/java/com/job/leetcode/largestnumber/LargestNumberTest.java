package com.job.leetcode.largestnumber;

import org.junit.Assert;
import org.junit.Test;

public class LargestNumberTest {

    @Test
    public void test() {
        LargestNumber largestNumber = new LargestNumber();
        Assert.assertEquals("12121", largestNumber.largestNumber(new int[]{121, 12}));
        Assert.assertEquals("201", largestNumber.largestNumber(new int[]{20, 1}));
        Assert.assertEquals("3412", largestNumber.largestNumber(new int[]{12, 34}));
        Assert.assertEquals("34330", largestNumber.largestNumber(new int[]{3, 30, 34}));
        Assert.assertEquals("9534330", largestNumber.largestNumber(new int[]{3, 30, 34, 5, 9}));
        Assert.assertEquals("824824769735703560743981399", largestNumber.largestNumber(new int[]{824, 1399, 5607, 6973, 5703,4398, 8247}));
        Assert.assertEquals("9609938824824769735703560743981399", largestNumber.largestNumber(new int[]{824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247}));
    }
}
