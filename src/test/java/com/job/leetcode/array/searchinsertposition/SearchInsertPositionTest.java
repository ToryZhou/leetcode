package com.job.leetcode.array.searchinsertposition;

import org.junit.Assert;
import org.junit.Test;

/**
 * Auther: toryzhou
 * Date: 7/9/18 21:21
 */
public class SearchInsertPositionTest {

    @Test
    public void test() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        Assert.assertEquals(2, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        Assert.assertEquals(1, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        Assert.assertEquals(4, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        Assert.assertEquals(0, searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));

    }
}
