package com.job.leetcode.array.maxareaofisland;

import org.junit.Assert;
import org.junit.Test;

public class MaxAreaOfIslandTest {
    @Test
    public void test() {
        MaxAreaOfIsland maxAreaOfIsland = new MaxAreaOfIsland();
        Assert.assertEquals(0, maxAreaOfIsland.maxAreaOfIsland(new int[][]{{0, 0}}));
    }
}
