package com.job.leetcode.backspacestringcompare;

import java.util.ArrayList;

/**
 * https://leetcode-cn.com/problems/backspace-string-compare
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        return get(S).equals(get(T));
    }

    private String get(String str) {
        ArrayList<Character> sList = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if ('#' != c) {
                sList.add(c);
            } else {
                if (sList.size() > 0) {
                    sList.remove(sList.size() - 1);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sList.forEach(sb::append);
        return sb.toString();
    }
}
