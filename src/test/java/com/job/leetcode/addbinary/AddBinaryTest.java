package com.job.leetcode.addbinary;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void test() {
        AddBinary addBinary = new AddBinary();
        Assert.assertEquals("100", addBinary.addBinary("11", "1"));
        Assert.assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }
}
