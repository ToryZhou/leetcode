package com.job.leetcode.countandsay;

import org.junit.Test;

public class CountAndSayTest {


    @Test
    public void test(){
        CountAndSay countAndSay = new CountAndSay();
        String s = countAndSay.countAndSay(3);
        System.out.println(s);
    }

}
