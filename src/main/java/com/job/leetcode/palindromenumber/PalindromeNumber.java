package com.job.leetcode.palindromenumber;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int original = x;
        int reveral = 0;
        while (x > 0) {
            reveral = reveral * 10;
            int last = x % 10;
            reveral = reveral + last;
            x = x / 10;
        }
        return reveral == original;
    }
}
