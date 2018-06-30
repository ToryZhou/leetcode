package com.job.leetcode.perfectnumber;

        import org.junit.Assert;
        import org.junit.Test;

public class PerfectNumberTest {

    @Test
    public void test() {
        PerfectNumber perfectNumber = new PerfectNumber();
        Assert.assertTrue(perfectNumber.checkPerfectNumber(28));
        Assert.assertFalse(perfectNumber.checkPerfectNumber(0));
        Assert.assertFalse(perfectNumber.checkPerfectNumber(13466917));
    }
}
