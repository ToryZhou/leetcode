package com.job.leetcode.array.positionsoflargegroups;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/positions-of-large-groups/description/
 */
public class PositionsOfLargeGroups {

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> lists = new ArrayList<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length - 1; ) {
            int length = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[i]) {
                    length++;
                } else {
                    break;
                }
            }
            if (length >= 3) {
                List<Integer> integers = new ArrayList<>();
                integers.add(i);
                integers.add(i + length - 1);
                lists.add(integers);
            }
            i = i + length;
        }
        return lists;
    }
}
