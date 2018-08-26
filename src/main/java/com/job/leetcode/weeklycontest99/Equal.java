package com.job.leetcode.weeklycontest99;

import java.util.Arrays;
import java.util.List;

public class Equal {

    public int numSpecialEquivGroups(String[] A) {
        //todo
        int num = 0;
        boolean found = false;
        List<String> list = Arrays.asList(A);
        for (int i = 0; i < list.size() - 1; i++) {
            String s = list.get(i);
            char[] chars = s.toCharArray();
            for (int j = i + 1; j < list.size(); ) {
                String s1 = list.get(j);
                char[] chars1 = s1.toCharArray();
                Boolean is = true;
                for (int m = 0; m < chars.length; m++) {
                    boolean find = false;
                    for (int n = 0; n < chars1.length; n++) {
                        if (m % 2 == n % 2 && chars[m] == chars1[n]) {
                            find = true;
                            break;
                        }
                    }
                    if (!find) {
                        is = false;
                        break;
                    }
                }
                if (is) {
                    list.remove(j);
                    if (!found) {
                        num += 1;
                    }
                    found = true;
                } else {
                    j++;
                }
            }
        }
        return num;
    }
}
