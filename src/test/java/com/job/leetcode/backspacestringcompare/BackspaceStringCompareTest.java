package com.job.leetcode.backspacestringcompare;

import org.junit.Assert;
import org.junit.Test;

public class BackspaceStringCompareTest {

    @Test
    public void test() {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
//        Assert.assertTrue(backspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        Assert.assertTrue(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
//        Assert.assertTrue(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
//        Assert.assertFalse(backspaceStringCompare.backspaceCompare("a#c", "b"));
    }
}
