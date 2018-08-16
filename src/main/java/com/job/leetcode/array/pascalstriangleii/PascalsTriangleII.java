package com.job.leetcode.array.pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/pascals-triangle-ii/description/
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        if (rowIndex == 0) {
            return integers;
        }
        integers.add(1);
        if (rowIndex == 1) {
            return integers;
        }
        for (int i = 1; i < rowIndex; i++) {
            ArrayList<Integer> latest = new ArrayList<>();
            latest.add(1);
            for (int j = 0; j < integers.size() - 1; j++) {
                latest.add(integers.get(j) + integers.get(j + 1));
            }
            latest.add(1);
            integers = latest;
        }
        return integers;
    }
}
