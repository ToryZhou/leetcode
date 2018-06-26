package com.job.leetcode.addbinary;

/**
 * https://leetcode-cn.com/problems/add-binary/description/
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        if (b.length() > a.length()) {
            String temp = b;
            b = a;
            a = temp;
        }

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int higher = 0;
        char temp = '0';
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0; i--, j--) {
            int i1 = Integer.parseInt(String.valueOf(aChars[i]));
            if (j >= 0) {
                int j1 = Integer.parseInt(String.valueOf(bChars[j]));
                switch (i1 + j1 + higher) {
                    case 0:
                        temp = '0';
                        higher = 0;
                        break;
                    case 1:
                        temp = '1';
                        higher = 0;
                        break;
                    case 2:
                        temp = '0';
                        higher = 1;
                        break;
                    case 3:
                        temp = '1';
                        higher = 1;
                        break;
                }
            } else {
                switch (i1 + higher) {
                    case 0:
                        temp = '0';
                        higher = 0;
                        break;
                    case 1:
                        temp = '1';
                        higher = 0;
                        break;
                    case 2:
                        temp = '0';
                        higher = 1;
                        break;
                }
            }
            result.insert(0, temp);
        }
        if (higher == 1) {
            result.insert(0, '1');
        }
        return result.toString();
    }

}
