package com.job.leetcode.weeklycontest99;

public class Area {


    public int surfaceArea(int[][] grid) {
        int total = 0;
        int same = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int[] aGrid : grid) {
                total += aGrid[i];
            }
        }
        total = total * 6;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > 0) {
                    same += (grid[j][i] - 1) * 2;
                }
                if (i < grid[0].length - 1) {
                    int minI = Math.min(grid[j][i], grid[j][i + 1]);
                    same += minI * 2;
                }
                if (j < grid.length - 1) {
                    int minJ = Math.min(grid[j][i], grid[j + 1][i]);
                    same += minJ * 2;
                }
            }
        }
        return total - same;
    }

}
