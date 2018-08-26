package com.job.leetcode.weeklycontest99;

import org.junit.Assert;
import org.junit.Test;

public class AreaTest {

    @Test
    public void test(){
        Area area = new Area();
        Assert.assertEquals(10,area.surfaceArea(new int[][]{{2}}));
        Assert.assertEquals(34,area.surfaceArea(new int[][]{{1,2},{3,4}}));
        Assert.assertEquals(16,area.surfaceArea(new int[][]{{1,0},{0,2}}));
        Assert.assertEquals(32,area.surfaceArea(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));
        Assert.assertEquals(46,area.surfaceArea(new int[][]{{2,2,2},{2,1,2},{2,2,2}}));
    }
}
