package com.job.leetcode.countandsay;

import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {


    @Test
    public void test() {
        CountAndSay countAndSay = new CountAndSay();
        Assert.assertEquals("1", countAndSay.countAndSay(1));
        Assert.assertEquals("11", countAndSay.countAndSay(2));
        Assert.assertEquals("21", countAndSay.countAndSay(3));
        Assert.assertEquals("1211", countAndSay.countAndSay(4));
        Assert.assertEquals("111221", countAndSay.countAndSay(5));
    }

}
