package com.job.leetcode.array.toeplitzmatrix;

import org.junit.Assert;
import org.junit.Test;

/**
 * Auther: toryzhou
 * Date: 8/27/18 19:45
 */
public class ToeplitzMatrixTest {


    @Test
    public void test() {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        Assert.assertTrue(toeplitzMatrix.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
    }
}
