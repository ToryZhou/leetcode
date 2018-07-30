package com.job.leetcode.array.movezeroes;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void test() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);

        int[] nums2 = {0, 0, 1};
        moveZeroes.moveZeroes(nums2);
        Assert.assertArrayEquals(new int[]{1, 0, 0}, nums2);
    }
}
