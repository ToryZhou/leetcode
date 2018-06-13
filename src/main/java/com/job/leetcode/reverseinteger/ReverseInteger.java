package com.job.leetcode.reverseinteger;

public class ReverseInteger {

    public int reverse(int x) {
        double biggest = Math.pow(2, 31) - 1;
        double smallest = Math.pow(-2, 31);
        int last;
        int result = 0;
        do {
            if (result * 1.0 * 10 > biggest || result * 1.0 * 10 < smallest) {
                return 0;
            }
            result = result * 10;
            last = x % 10;
            x = x / 10;
            if (0.0 + result + last > biggest || 0.0 + result + last < smallest) {
                return 0;
            }
            result = result + last;
        } while (0 != x);
        return result;
    }
}
