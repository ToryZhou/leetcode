package com.job.leetcode.reverseinteger;

public class ReverseInteger {

    public int reverse(int x) {
        int last;
        int result = 0;
        do {
            last = x % 10;
            x = x / 10;
            result = (x != 0 ? result * 10 : result) + (x != 0 ? last * 10 : last);
        } while (x != 0);
        return result;
    }
}
