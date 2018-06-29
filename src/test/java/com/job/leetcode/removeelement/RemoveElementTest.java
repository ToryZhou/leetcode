package com.job.leetcode.removeelement;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void test() {
        RemoveElement removeElement = new RemoveElement();
        Assert.assertEquals(2, removeElement.removeElement(new int[]{3, 2, 2, 3}, 3));
        Assert.assertEquals(5, removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));

    }
}
