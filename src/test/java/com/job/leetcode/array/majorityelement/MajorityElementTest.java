package com.job.leetcode.array.majorityelement;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void test(){
        MajorityElement majorityElement = new MajorityElement();
        Assert.assertEquals(3,majorityElement.majorityElement(new int[]{3,2,3}));
    }
}
