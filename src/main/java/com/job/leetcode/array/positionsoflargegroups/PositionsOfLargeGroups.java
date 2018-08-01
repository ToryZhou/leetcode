package com.job.leetcode.array.positionsoflargegroups;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/positions-of-large-groups/description/
 */
public class PositionsOfLargeGroups {

    public List<List<Integer>> largeGroupPositions(String S) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // todo
            int begin = i;
            int end = i;

            char temp = chars[i];
        }
        return lists;
    }
}
