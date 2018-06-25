package com.job.leetcode.magicsquaresingrid;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * https://leetcode-cn.com/problems/magic-squares-in-grid/description/
 */
public class MagicSquaresInGrid {

    public int numMagicSquaresInside(int[][] grid) {
        int xMaxIndex = grid[0].length - 2;
        int yMaxIndex = grid.length - 2;
        int result = 0;
        for (int xIndex = 0; xIndex < yMaxIndex; xIndex++) {
            for (int yIndex = 0; yIndex < xMaxIndex; yIndex++) {
                int[][] square = new int[3][3];
                square[0][0] = grid[xIndex][yIndex];
                square[0][1] = grid[xIndex][yIndex + 1];
                square[0][2] = grid[xIndex][yIndex + 2];

                square[1][0] = grid[xIndex + 1][yIndex];
                square[1][1] = grid[xIndex + 1][yIndex + 1];
                square[1][2] = grid[xIndex + 1][yIndex + 2];

                square[2][0] = grid[xIndex + 2][yIndex];
                square[2][1] = grid[xIndex + 2][yIndex + 1];
                square[2][2] = grid[xIndex + 2][yIndex + 2];
                if (isMagicSquare(square)) {
                    result++;
                }
            }

        }
        return result;
    }

    private boolean isMagicSquare(int[][] square) {
        if (5 != square[1][1]) {
            return false;
        }
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int xValue = 0;
            int yValue = 0;
            for (int j = 0; j < 3; j++) {
                integers.add(square[i][j]);
                xValue += square[i][j];
                yValue += square[j][i];
            }
            if (xValue != 15 || yValue != 15) {
                return false;
            }
        }
        integers.sort(Comparator.comparingInt(a -> a));

        for (int i = 0; i < 9; i++) {
            if (integers.get(i) != i + 1) {
                return false;
            }
        }

        return true;
    }
}
