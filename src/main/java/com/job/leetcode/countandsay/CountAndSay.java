package com.job.leetcode.countandsay;

/**
 * https://leetcode-cn.com/problems/count-and-say/description/
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n - 1; i++) {
            s = calc(s);
        }
        return s;
    }

    private String calc(String s) {
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        int size = 1;
        boolean end = false;
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i + 1] == chars[i]) {
                size++;
            } else {
                end = true;
            }
            if (i == chars.length - 1) {
                end = true;
            }
            if (end) {
                result.append(size).append(chars[i]);
                size = 1;
                end = false;
            }
        }
        return result.toString();
    }
}
