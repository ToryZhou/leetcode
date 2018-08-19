package com.job.leetcode.array.implementstrstr;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStrStrTest {

    @Test
    public void test() {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        Assert.assertEquals(2, implementStrStr.strStr("hello", "ll"));
    }
}
