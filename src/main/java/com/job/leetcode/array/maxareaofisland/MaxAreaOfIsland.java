package com.job.leetcode.array.maxareaofisland;

/**
 * https://leetcode-cn.com/problems/max-area-of-island/description/
 */
public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        //todo
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int temp = 0;
                if (grid[i][j] == 1) {
                    for (int m = j; j < grid[0].length; j++) {
                        if (grid[i][m] == 1) {
                            temp += 1;
                        } else {
                            break;
                        }
                    }
                    for (int n = i; n < grid.length; n++) {
                        if (grid[n][j] == 1) {
                            temp += 1;
                        } else {
                            break;
                        }
                    }
                }
                if (temp > max) {
                    max = temp;
                }

            }
        }
        return max;
    }

}
