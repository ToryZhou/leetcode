package com.job.leetcode.longestcommonprefix;

/**
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String shortest = findTheShortest(strs);
        char[] chars = shortest.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            boolean allEquals = true;
            for (String str : strs) {
                if (chars[i] != str.toCharArray()[i]) {
                    allEquals = false;
                }
            }
            if (allEquals) {
                sb.append(chars[i]);
            } else {
                break;
            }
        }
        return sb.toString();
    }

    private String findTheShortest(String[] strs) {
        String shortest = strs[0];
        for (String str : strs) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }
}
