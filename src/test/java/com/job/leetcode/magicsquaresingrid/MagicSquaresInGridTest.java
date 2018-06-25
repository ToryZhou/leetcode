package com.job.leetcode.magicsquaresingrid;

import org.junit.Assert;
import org.junit.Test;

public class MagicSquaresInGridTest {

    @Test
    public void test() {
        MagicSquaresInGrid magicSquaresInGrid = new MagicSquaresInGrid();
//        int[][] grid = {{4, 3, 8, 4},
//                {9, 5, 1, 9},
//                {2, 7, 6, 2}};
//        Assert.assertEquals(1, magicSquaresInGrid.numMagicSquaresInside(grid));

        int[][] grid2 = {{3, 1, 8, 6, 4, 2, 9, 7, 2}, {6, 10, 5, 0, 10, 5, 0, 5, 9}, {1, 4, 2, 9, 1, 8, 6, 3, 4}, {8, 3, 4, 4, 7, 5, 3, 3, 5}, {2, 9, 3, 8, 2, 9, 4, 4, 4}, {7, 5, 3, 10, 2, 1, 5, 9, 7}, {5, 6, 4, 5, 10, 6, 7, 2, 4}, {0, 4, 8, 0, 3, 6, 9, 7, 8}, {7, 2, 3, 3, 5, 11, 2, 9, 1}};
        Assert.assertEquals(0, magicSquaresInGrid.numMagicSquaresInside(grid2));
    }
}
