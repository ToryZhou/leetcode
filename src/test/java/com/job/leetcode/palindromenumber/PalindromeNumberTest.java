package com.job.leetcode.palindromenumber;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void test(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assert.assertTrue(palindromeNumber.isPalindrome(12321));
        Assert.assertFalse(palindromeNumber.isPalindrome(123));
        Assert.assertFalse(palindromeNumber.isPalindrome(10));
        Assert.assertFalse(palindromeNumber.isPalindrome(-121));
        Assert.assertFalse(palindromeNumber.isPalindrome(-1));
    }
}
