package com.job.leetcode.array.positionsoflargegroups;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PositionsOfLargeGroupsTest {

    @Test
    public void test() {
        PositionsOfLargeGroups positionsOfLargeGroups = new PositionsOfLargeGroups();
        List<List<Integer>> abbxxxxzzy = positionsOfLargeGroups.largeGroupPositions("abbxxxxzzy");
        Assert.assertEquals(3, (int) abbxxxxzzy.get(0).get(0));
        Assert.assertEquals(6, (int) abbxxxxzzy.get(0).get(1));
    }
}
