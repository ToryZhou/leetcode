package com.job.leetcode.weeklycontest99;

import org.junit.Assert;
import org.junit.Test;

public class EqualTest {

    @Test
    public void test() {
        Equal equal = new Equal();
        Assert.assertEquals(3, equal.numSpecialEquivGroups(new String[]{"a", "b", "c", "a", "c", "c"}));
    }
}
