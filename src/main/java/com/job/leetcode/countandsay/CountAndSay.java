package com.job.leetcode.countandsay;

/**
 * https://leetcode-cn.com/problems/count-and-say/description/
 */
public class CountAndSay {
    // todo
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n; i++) {
            char[] chars = s.toCharArray();
            char temp = chars[0];
            int size = 0;
            boolean end = false;
            for (int j = 0; j < chars.length; j++) {
                if (temp == chars[j]) {
                    size++;
                } else {
                    end = true;
                    temp = chars[j];
                }
                if (j == chars.length - 1) {
                    end = true;
                }
                if (end) {
                    s = size + "" + temp;
                    size = 0;
                }
            }
        }
        return s;
    }
}
