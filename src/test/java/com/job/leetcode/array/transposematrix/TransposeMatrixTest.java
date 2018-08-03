package com.job.leetcode.array.transposematrix;

import org.junit.Assert;
import org.junit.Test;

public class TransposeMatrixTest {

    @Test
    public void test() {
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        Assert.assertArrayEquals(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}, transposeMatrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }
}
