package com.job.leetcode.longestcommonprefix;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void test() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"aca", "cba"}));
    }
}
