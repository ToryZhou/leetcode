package com.job.leetcode.maximizedistancetoclosestperson;

import org.junit.Assert;
import org.junit.Test;

public class MaximizeDistanceToClosestPersonTest {

    @Test
    public void test() {
        MaximizeDistanceToClosestPerson maximizeDistanceToClosestPerson = new MaximizeDistanceToClosestPerson();
        Assert.assertEquals(2, maximizeDistanceToClosestPerson.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));

        Assert.assertEquals(3, maximizeDistanceToClosestPerson.maxDistToClosest(new int[]{1, 0, 0, 0}));
        Assert.assertEquals(2, maximizeDistanceToClosestPerson.maxDistToClosest(new int[]{0, 0, 1}));
        Assert.assertEquals(2, maximizeDistanceToClosestPerson.maxDistToClosest(new int[]{0,1,1,1,0,0,1,0,0}));
        Assert.assertEquals(3, maximizeDistanceToClosestPerson.maxDistToClosest(new int[]{0,0,0,1,0,0,0,1,0,0,0,0,1,1,0,0,0,1}));
    }
}
