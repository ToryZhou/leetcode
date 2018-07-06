package com.job.leetcode.array.rotatearray;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {


    @Test
    public void test() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 3);
        Assert.assertEquals(5, nums[0]);
        Assert.assertEquals(6, nums[1]);
        Assert.assertEquals(7, nums[2]);
        Assert.assertEquals(1, nums[3]);
        Assert.assertEquals(2, nums[4]);
        Assert.assertEquals(3, nums[5]);
        Assert.assertEquals(4, nums[6]);
    }
}
