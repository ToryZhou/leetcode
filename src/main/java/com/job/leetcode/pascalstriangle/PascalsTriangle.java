package com.job.leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/pascals-triangle/description/
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows == 0) {
            return lists;
        }
        List<Integer> listFirst = new ArrayList<>();
        listFirst.add(1);
        lists.add(listFirst);
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            List<Integer> preList = lists.get(i);
            for (int j = 0; j < preList.size() - 1; j++) {
                list.add(preList.get(j) + preList.get(j + 1));
            }
            list.add(1);
            lists.add(list);
        }
        return lists;
    }

}
