package com.job.leetcode.array.reshapethematrix;

import org.junit.Test;

/**
 * Auther: toryzhou
 * Date: 8/8/18 20:41
 */
public class ReshapeTheMatrixTest {


    @Test
    public void test() {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] ints = reshapeTheMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
        int[][] ints2 = reshapeTheMatrix.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1);
        System.out.println(ints);
    }
}
